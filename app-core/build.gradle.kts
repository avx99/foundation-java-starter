plugins {
    id("foundation.core")
}

dependencies {
    api(project(":app-api"))
}

/*

Appliquer le plugin "foundation.core" est un raccourci pour la congiuration suivante:

plugins {
    id("foundation.java8") // Configure le projet pour un usage avec le SDK Java8
    id("foundation.test.junit5") // Active les tests unitaires Junit5
}

dependencies {
    api("dev.soffa.foundation:foundation-core:${property("f4j.version")}")
}
 */
