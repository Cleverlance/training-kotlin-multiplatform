## XCode iOS project integration with Kotlin Multiplatform XCFramework

### Add 'Run script' build Phrase in XCode above 'Compile Sources' phase

`cd $SRCROOT/../../../.. && ./gradlew :day-1:06-kmp-full-project:ios:integration:assembleMultiplatformXCFramework --no-configuration-cache`

### On 'Build Settings' tab set the 'Framework Search Path'

`$(SRCROOT)/../integration/build/out/xcframework/$(CONFIGURATION)`

### On 'General' tab add XCFramework under 'Frameworks, Libraries, and Embedded Content'

`Multiplatform.xcframework`

> *Caution:* When executed from XCode the iOS app might need to be build twice to apply changes in
> shared code XCFramework.

## Official Documentation:

### Experimental

https://kotlinlang.org/docs/multiplatform-native-artifacts.html

### Standard

https://kotlinlang.org/docs/multiplatform-build-native-binaries.html

### Hands-on tutorial

https://kotlinlang.org/docs/multiplatform-mobile-integrate-in-existing-app.html