

plugins {
    id("dev.nx.gradle.native") version("+")
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.3.0"
}

allprojects {
  apply {
      plugin("project-report")
      plugin("dev.nx.gradle.native")
  }
}

tasks.register("projectReportAll") {
    // All project reports of subprojects
    allprojects.forEach {
        dependsOn(it.tasks.get("projectReport"))
    }

    // All projectReportAll of included builds
    gradle.includedBuilds.forEach {
        dependsOn(it.task(":projectReportAll"))
    }
}

group = "org.sample"
version = "1.0"