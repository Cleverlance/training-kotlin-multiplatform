plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    macosArm64("macos")

    sourceSets {
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test")) // Adds the dependency to respective targets
            }
        }
        val macosMain by getting {
            dependencies {
                implementation("com.squareup.sqldelight:native-driver:1.5.5")
            }
        }
        val jvmMain by getting {
            dependencies {
                implementation("com.squareup.sqldelight:sqlite-driver:1.5.5")
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation("junit:junit:4.13")
            }
        }
    }
}