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
include(":day-1:06-kmp-full-project:shared:libraryA")
include(":day-1:06-kmp-full-project:shared:libraryB")
include(":day-1:06-kmp-full-project:android:app")
include(":day-1:06-kmp-full-project:ios:integration")