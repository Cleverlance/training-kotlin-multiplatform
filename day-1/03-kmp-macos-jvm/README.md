## Run tests for all targets

`gradle :day-1:03-kmp-macos-jvm:check --console=plain`

## Run tests for all modules

`gradle check --console=plain`

## JVM-only dependency

``` kotlin
val jvmTest by getting {
    dependencies {
        implementation("junit:junit:4.13")
    }
}
```

## JVM & Native non-multiplatform dependency

``` kotlin
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
```