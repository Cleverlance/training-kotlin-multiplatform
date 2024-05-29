plugins {
    kotlin("multiplatform")
}

kotlin {
    iosArm64()
    iosSimulatorArm64()

    kotlinArtifacts {
        Native.XCFramework("Multiplatform") {
            targets(iosArm64, iosSimulatorArm64)
            binaryOption("bundleId", "ios.app")
            setModules(
                project(":day-1:06-kmp-full-project:shared:libraryA"),
                project(":day-1:06-kmp-full-project:shared:libraryB")
            )
        }
    }
}