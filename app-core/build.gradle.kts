plugins {
    id("soffa.java8") // Configure le projet pour un usage avec le SDK Java8
    id("soffa.test.junit5") // Active les tests unitaires Junit5
}

dependencies {
    api(project(":app-api"))
    api("io.soffa.foundation:foundation-application:${property("foundation.version")}")
}
