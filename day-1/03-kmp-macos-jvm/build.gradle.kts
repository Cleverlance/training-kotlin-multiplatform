plugins {
    kotlin("multiplatform")
}

kotlin {
    jvm()
    macosArm64()

    sourceSets {
        commonTest.dependencies {
            implementation(kotlin("test")) // Adds the dependency to respective targets
        }
        macosMain.dependencies {
            implementation("com.squareup.sqldelight:native-driver:1.5.5")
        }
        jvmMain.dependencies {
            implementation("com.squareup.sqldelight:sqlite-driver:1.5.5")
        }
        jvmTest.dependencies {
            implementation("junit:junit:4.13.2")
        }
    }
}