plugins {
    id("application")
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.3.0"
}

application {
    mainClass = "org.sample.myapp.Main"
}

dependencies {
    implementation("org.sample:number-utils:1.0")
    implementation("org.sample:string-utils:1.0")
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}
