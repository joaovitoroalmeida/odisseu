import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val projectVersion: String by ext
val kotlinVersion: String by ext
val kotlinCoroutinesVersion: String by ext
val jacksonVersion: String by ext
val springBootStarterVersion: String by ext
val mockkVersion: String by ext
val pitestVersion: String by ext
val pitestJunit5Version: String by ext

java.sourceCompatibility = JavaVersion.VERSION_11

plugins {
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"

	id("org.springframework.boot") version "2.6.4" apply false
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("info.solidsoft.pitest") version "1.4.7"
}

allprojects {
	version = projectVersion
	group = "com.helpcar.customer.api"

	repositories {
		mavenCentral()
		mavenLocal()
	}
}

subprojects {
	apply {
		plugin("kotlin")
		plugin("kotlin-spring")

		plugin("io.spring.dependency-management")
		plugin("info.solidsoft.pitest")

		plugin("idea")
	}

	dependencyManagement {
		imports {
			mavenBom("org.springframework.boot:spring-boot-dependencies:$springBootStarterVersion")
			mavenBom("org.springframework.boot:spring-boot-starter-parent:$springBootStarterVersion")
		}
		dependencies {
			// kotlin
			dependency("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
			dependency("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")

			// jackson
			dependency("com.fasterxml.jackson.module:jackson-module-kotlin:$jacksonVersion")

			// test
			dependency("io.mockk:mockk:$mockkVersion")

			// pitest
			dependency("info.solidsoft.gradle.pitest:gradle-pitest-plugin:$pitestVersion")
			dependency("org.pitest:pitest-junit5-plugin:$pitestJunit5Version")
		}
	}

	dependencies {
		// kotlin
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

		// jackson
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

		// spring
		implementation("org.springframework.boot:spring-boot-starter-web")

		// pitest
		implementation("info.solidsoft.gradle.pitest:gradle-pitest-plugin")
		implementation("org.pitest:pitest-junit5-plugin")

		// test
		testImplementation("io.mockk:mockk")
		testImplementation("org.springframework.boot:spring-boot-starter-test") {
			exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
		}
	}

	tasks {
		withType<KotlinCompile> {
			kotlinOptions {
				freeCompilerArgs = listOf("-Xjsr305=strict")
				jvmTarget = "11"
			}
		}

		pitest {
			testPlugin.set("junit5")
			outputFormats.set(setOf("HTML"))
			mutators.set(setOf("STRONGER", "DEFAULTS"))
		}

		test {
			useJUnitPlatform()
		}
	}
}
