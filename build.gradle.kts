plugins {
    java
    application
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClass.set("jagex2.client.Client")
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "jagex2.client.Client"
        )
    }

    from({
        configurations.runtimeClasspath.get().map { if (it.isDirectory()) it else zipTree(it) }
    })

    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.addAll(listOf("-Xlint:none"))
}
