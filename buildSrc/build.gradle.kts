plugins {
    `kotlin-dsl`
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    gradlePluginPortal()
    google()
}

dependencies {
    implementation(kotlin("gradle-plugin"))
    implementation("com.android.tools.build:gradle:8.1.1")
}