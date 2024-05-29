plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    iosArm64()
    iosSimulatorArm64()

    kotlinArtifacts {
        Native.XCFramework("Multiplatform") {
            targets(iosArm64, iosSimulatorArm64)
            binaryOption("bundleId", "ios.app")
        }
    }
}