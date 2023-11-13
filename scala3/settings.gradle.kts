
rootProject.name = "lp2-lc"
//val versions = gradle.rootProject.versions()

include(
    ":lp2lc"
)


pluginManagement.repositories {
    gradlePluginPortal()
    mavenLocal()
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}
