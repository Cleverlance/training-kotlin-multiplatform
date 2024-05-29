plugins {
    id("com.android.library")
    kotlin("multiplatform")
}

kotlin {
    androidTarget()
    iosArm64()
    iosSimulatorArm64()

    jvmToolchain(17)

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}

android {
    namespace = "shared.libraryA"
    compileSdk = 34
}