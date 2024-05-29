## Run tests for all targets

`gradle :day-1:03-kmp-macos-jvm:check --console=plain`

## Run tests for all modules

`gradle check --console=plain`

## JVM-only dependency

``` kotlin
jvmTest.dependencies {
    implementation("junit:junit:4.13.2")
}
```

## JVM & Native non-multiplatform dependency

``` kotlin
macosMain.dependencies {
    implementation("com.squareup.sqldelight:native-driver:1.5.5")
}
jvmMain.dependencies {
    implementation("com.squareup.sqldelight:sqlite-driver:1.5.5")
}
```