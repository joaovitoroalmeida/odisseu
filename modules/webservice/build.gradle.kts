plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":odisseu-api"))
    implementation(project(":odisseu-dataprovider"))
    implementation(project(":odisseu-database"))
    implementation(project(":odisseu-usecase"))
}

springBoot {
    buildInfo()
}