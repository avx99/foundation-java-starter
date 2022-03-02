plugins {
    id("foundation.java8") 
    id("foundation.test.junit5")
    id("foundation.qa.coverage.l7") 
}

dependencies {
    api("io.soffa.foundation:foundation-api:${property("foundation.version")}")
}
