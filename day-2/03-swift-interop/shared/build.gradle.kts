plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    iosArm64("ios")
    iosSimulatorArm64()

    sourceSets {
        val iosMain by getting {}
        val iosTest by getting {}
        val iosSimulatorArm64Main by getting { dependsOn(iosMain) }
        val iosSimulatorArm64Test by getting { dependsOn(iosTest) }
    }

    kotlinArtifacts {
        Native.XCFramework("Multiplatform") {
            targets(iosArm64, iosSimulatorArm64)
            binaryOption("bundleId", "ios.app")
        }
    }
}