plugins {
    `java-library`
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.3.0"
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}
