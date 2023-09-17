rootProject.name = "training-kotlin-multiplatform"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

include(":day-1:01-jvm-minimal")
include(":day-1:02-kmp-minimal")