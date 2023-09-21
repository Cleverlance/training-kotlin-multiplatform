plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    iosArm64("ios")
    iosSimulatorArm64()

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val iosMain by getting {}
        val iosTest by getting {}
        val iosSimulatorArm64Main by getting { dependsOn(iosMain) }
        val iosSimulatorArm64Test by getting { dependsOn(iosTest) }
    }
}