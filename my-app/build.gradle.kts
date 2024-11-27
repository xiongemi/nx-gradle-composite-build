
plugins {
    id("io.nx.gradle.plugin.Nodes") version("0.1.0")
}


allprojects {
  apply {
      plugin("project-report")
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