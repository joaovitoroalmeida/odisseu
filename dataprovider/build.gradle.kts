plugins {
    id("org.flywaydb.flyway") version "6.4.2"
}

dependencies {
    implementation(project(":odisseu-api"))
    implementation(project(":odisseu-usecase"))

    //spring
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // db
    implementation("org.flywaydb:flyway-core")
    runtimeOnly("org.postgresql:postgresql")
}