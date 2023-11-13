buildscript {
    repositories {
        // Add here whatever repositories you're already using
        mavenCentral()
    }
}

plugins {
    id("ai.acyclic.scala3-conventions")
}

idea {

    module {
//        excludeDirs.add(file("latex"))
    }
}