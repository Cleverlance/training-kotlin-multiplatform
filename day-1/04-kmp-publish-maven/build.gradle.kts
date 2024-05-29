plugins {
    kotlin("multiplatform")
    `maven-publish`
}

version = "1.0"

kotlin {
    jvm()
    macosArm64()

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}