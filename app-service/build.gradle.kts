plugins {
    id("foundation.java8")
    id("foundation.springboot")
    id("foundation.qa.coverage.l4")
}

dependencies {
    implementation(project(":app-core"))
    implementation("io.soffa.foundation:foundation-service:${property("foundation.version")}")
    testImplementation("io.soffa.foundation:foundation-service-test:${property("foundation.version")}")
}
