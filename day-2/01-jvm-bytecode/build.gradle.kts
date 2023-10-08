plugins {
    kotlin("jvm")
}

tasks.withType(JavaExec::class).configureEach {
    if (name.endsWith("main()")) {
        notCompatibleWithConfigurationCache("https://github.com/gradle/gradle/issues/21364")
    }
}