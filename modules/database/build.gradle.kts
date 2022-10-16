plugins {
    id("org.flywaydb.flyway") version "8.5.10"
}

dependencies {
    implementation(project(":odisseu-api"))
    implementation(project(":odisseu-dataprovider"))

    implementation("org.springframework:spring-jdbc")

    // db
    implementation("org.flywaydb:flyway-core")
    runtimeOnly("org.postgresql:postgresql")
}