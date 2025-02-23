import java.math.BigInteger

fun main() {
    List(3) {
        List(readln().toInt()) {
            readln().toBigInteger()
        }.reduce { acc, s -> acc + s }
    }.forEach {
        println(
            when {
                it > BigInteger.ZERO -> "+"
                it < BigInteger.ZERO -> "-"
                else -> "0"
            }
        )
    }
}
