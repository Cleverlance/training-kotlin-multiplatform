plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "app.android"
    compileSdk = 34
    defaultConfig {
        applicationId = "app.android"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(project(":day-1:06-kmp-full-project:shared:libraryA"))
    implementation(project(":day-1:06-kmp-full-project:shared:libraryB"))
}