import kotlin.math.sqrt

fun main() {
    readln()
    val list = readln()
        .split(" ")
        .map { it.toInt() }

    println(list.count { it.isPrime() })
}

fun Int.isPrime(): Boolean {
    if (2 > this) return false
    if (2 == this) return true
    if (this % 2 == 0) return false
    for (i in 2..sqrt(this.toDouble()).toInt()) {
        if (this % i == 0) return false
    }
    return true
}