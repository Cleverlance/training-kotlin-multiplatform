plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

kotlin {
    androidTarget()
    iosArm64("ios")
    iosSimulatorArm64()

    jvmToolchain(17)

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

android {
    namespace = "android"
    compileSdk = 34
}