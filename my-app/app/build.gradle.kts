plugins {
    id("application")
    id("dev.nx.gradle.project-graph") version("0.1.0")
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
