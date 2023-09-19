plugins {
    `kotlin-dsl`
    kotlin("jvm") version embeddedKotlinVersion // https://youtrack.jetbrains.com/issue/KTIJ-25236
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