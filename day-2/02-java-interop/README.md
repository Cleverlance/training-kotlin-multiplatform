## void, Unit, static, top-level

- Java class: `void voidFunction()`
- Kotlin class: `fun unitFunction()`
- Java class: `static void voidFunction()`
- Kotlin object: `fun unitFunction()` + `@JvmStatic`
- Kotlin top-level: `fun unitFunction()` + `@file:JvmName("Kotlin")`

## Exceptions

- Java class: `static void throwsFunction() throws Exception`
- Kotlin top-level: `fun nothingFunction(): Nothing`
- Kotlin top-level: `@Throws(Exception::class) fun nothingFunction(): Nothing`

## Nullability

- Java class: `static Integer intFunction(int a, Integer b)`
- Java class: `@Nullable static Integer intFunction(int a, @NotNull Integer b)`
- Kotlin top-level: `fun intFunction(a: Int, b: Int?): Int?` + `Show Kotlin Bytecode` -> `Decompile`

## Collections

- Java class: `static @NotNull List<String> listFunction()`
- Kotlin top-level: `fun listFunction(): List<String>`
- Kotlin top-level: `fun mutableListFunction(): MutableList<String>`

## Fields & properties

- Java class: `String field`
- Java class: `String getProperty()` + `void setProperty(String value)`
- Kotlin top-level: `val readOnlyProperty: String` + `var readWriteProperty: String`

## Coroutines

- Kotlin top-level: `suspend fun doSomethingAsync(input: String): Int`

## Sealed classes

```
sealed interface Animal {
  data class Dog(val lives: Boolean) : Animal
  data object Dinosaur : Animal
}
```