actual abstract class UseCase<in I : Any, out O : Any> {
    actual abstract operator fun invoke(input: I): O
}