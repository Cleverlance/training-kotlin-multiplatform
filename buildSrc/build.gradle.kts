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
}

dependencies {
    implementation(kotlin("gradle-plugin"))
}