
import kotlin.math.sqrt

fun main() {
    val list = (readln().toInt()..readln().toInt()).toList()
    var sum = 0
    var first = 0
    list.forEach {
        if (it.isPrime()) {
            if (sum == 0) {
                first = it
            }
            sum += it
        }
    }
    if (sum == 0) {
        println(-1)
        return
    } else {
        println(sum)
        println(first)
    }
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