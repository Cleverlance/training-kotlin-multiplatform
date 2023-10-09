## Unit, top-level, annotations

- Kotlin: `fun unitFunction()` + `@ObjCName("voidFunction")`
- Kotlin: `fun kotlinOnlyFunction()` + `@HiddenFromObjC`

## Exceptions

- Kotlin: `fun nothingFunction(): Nothing`
- Kotlin: `fun throwsFunction(): Nothing` + `@Throws(Exception::class)`

## Nullability

- Kotlin: `fun intFunction(a: Int, b: Int?): Long`

## Collections

- Kotlin: `fun listFunction(): List<String>`
- Kotlin: `fun mutableListFunction(): MutableList<String>`

## Fields & properties

- Kotlin: `val readOnlyProperty: String` + `var readWriteProperty: String`

## Classes & objects

- Kotlin: `class Class`
- Kotlin: `object Object`
- Kotlin: `enum class City { London, Paris, NewYork }`
- Kotlin: `data class User(val firstName: String, val lastName: String)`
- Kotlin:

```
sealed interface Animal {
  data class Dog(val lives: Boolean) : Animal
  data object Dinosaur : Animal
}
```

## Generics

- Kotlin: `interface Interface<T>`
- Kotlin: `class ImplementationOfInterface : Interface<String>`
- Kotlin: `abstract class AbstractClass<T>`
- Kotlin: `class ImplementationOfAbstractClass : AbstractClass<String>()`
- Kotlin: `UseCase` & `callAsFunction()` operator

## Coroutines

- Kotlin: `suspend fun doSomethingAsync(input: String): Int`