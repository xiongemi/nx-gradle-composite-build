pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "my-composite"

includeBuild("my-app")
includeBuild("my-utils")
