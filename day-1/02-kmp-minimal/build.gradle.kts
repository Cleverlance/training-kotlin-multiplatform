plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()

    sourceSets {
        jvmTest.dependencies {
            implementation(kotlin("test"))
        }
    }
}