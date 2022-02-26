plugins {
    id("org.springframework.boot")
}

dependencies {
    implementation(project(":helpcar-customer-api"))
    implementation(project(":helpcar-customer-dataprovider"))
    implementation(project(":helpcar-customer-usecase"))
}

springBoot {
    buildInfo()
}