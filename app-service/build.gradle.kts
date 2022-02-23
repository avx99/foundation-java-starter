plugins {
    id("soffa.java8")
    id("soffa.springboot")
    id("soffa.qa.coverage.l4")
}

dependencies {
    implementation(project(":app-core"))
    implementation("io.soffa.foundation:foundation-service:${property("foundation.version")}")
    testImplementation("io.soffa.foundation:foundation-service-test:${property("foundation.version")}")
}
