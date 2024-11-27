
plugins {
    id("io.nx.gradle.plugin.Nodes") version("0.1.0")
}


allprojects {
    apply {
        plugin("io.nx.gradle.plugin.Nodes")
    }
}

tasks.register("projectReportAll") {

    // All projectReportAll of included builds
    gradle.includedBuilds.forEach {
        dependsOn(it.task(":projectReportAll"))
    }
}