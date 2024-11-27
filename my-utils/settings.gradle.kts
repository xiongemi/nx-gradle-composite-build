pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}


rootProject.name = "my-utils"

include("number-utils", "string-utils")
