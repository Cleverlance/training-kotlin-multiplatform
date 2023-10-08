import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val a = 3
    val b = 4
    val c = calc(a, b)
    println(c)
}

fun calc(a: Int, b: Int): Int {
    return sqrt(a.toDouble().pow(2) + b.toDouble().pow(2)).toInt()
}