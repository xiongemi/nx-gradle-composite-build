plugins {
    `java-library`
    id("dev.nx.gradle.project-graph") version("0.1.0")
}

group = "org.sample"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.commons:commons-lang3:3.4")
}
