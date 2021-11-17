plugins {
    id("soffa.java8") // Configure le projet pour un usage avec le SDK Java8
    id("soffa.test.junit5") // Active les tests unitaires Junit5
    id("soffa.qa.coverage.l7") // Vérifie que la couverture de code est à 80%+
}

dependencies {
    api("io.soffa.foundation:soffa-foundation-api:${property("foundation.version")}")
}
