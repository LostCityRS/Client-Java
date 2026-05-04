plugins {
    java
    application
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

application {
    mainClass.set("deob.client")
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "deob.client"
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
