defaultTasks("run")

plugins {
    id("dev.nx.gradle.native") version("+")
}

tasks.register("run") {
    dependsOn(gradle.includedBuild("my-app").task(":app:run"))
}

tasks.register("checkAll") {
    dependsOn(gradle.includedBuild("my-app").task(":app:check"))
    dependsOn(gradle.includedBuild("my-utils").task(":number-utils:check"))
    dependsOn(gradle.includedBuild("my-utils").task(":string-utils:check"))
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