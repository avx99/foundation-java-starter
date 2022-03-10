plugins {
    id("foundation.java8")
    id("foundation.springboot")
    id("foundation.qa.coverage.l4")
}

dependencies {
    implementation(project(":app-core"))
    implementation("dev.soffa.foundation:foundation-starter:${property("f4j.version")}")
    testImplementation("dev.soffa.foundation:foundation-starter-test:${property("f4j.version")}")
}
