plugins {
    kotlin("multiplatform")
    `maven-publish`
}

version = "1.0"

kotlin {
    jvm()
    macosArm64("macos")

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}