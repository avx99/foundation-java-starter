plugins {
    id("foundation.service")
    id("foundation.qa.coverage.l6") // Requiert une couverture de test de 60%+
}

dependencies {
    implementation(project(":app-core"))
}

/*

Appliquer le plugin "foundation.service" est un raccourci pour la congiuration suivante:

plugins {
    id("foundation.java8")
    id("foundation.springboot")
}

dependencies {
    implementation("dev.soffa.foundation:foundation-starter:${property("f4j.version")}")
    testImplementation("dev.soffa.foundation:foundation-starter-test:${property("f4j.version")}")
}
 */
