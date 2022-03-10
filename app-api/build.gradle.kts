plugins {
    id("foundation.java8") 
    id("foundation.test.junit5")
    id("foundation.qa.coverage.l7") 
}

dependencies {
    api("dev.soffa.foundation:foundation-api:${property("f4j.version")}")
}
