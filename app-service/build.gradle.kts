plugins {
    id("soffa.java8")
    id("soffa.springboot")
    id("soffa.qa.coverage.l4") // Vérifie que la couverture de code est à 80%+

}

dependencies {
    implementation(project(":app-core"))
    implementation("io.soffa.foundation:soffa-foundation-springboot:${property("foundation.version")}")
    testImplementation("io.soffa.foundation:soffa-foundation-test:${property("foundation.version")}")
}
