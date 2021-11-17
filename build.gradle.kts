buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        maven {
            setUrl("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("io.soffa.gradle:soffa-gradle-plugin:2.1.1")
    }
}

subprojects {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}
