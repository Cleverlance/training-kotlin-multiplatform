rootProject.name = "training-kotlin-multiplatform"

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }
}

include(":day-1:01-jvm-minimal")
include(":day-1:02-kmp-minimal")
include(":day-1:03-kmp-macos-jvm")
include(":day-1:04-kmp-publish-maven")
include(":day-1:05-kmp-ios-android")