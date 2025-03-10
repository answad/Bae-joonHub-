import java.math.BigInteger

fun main() {
    val map = mapOf(
        "black" to Pair(0, BigInteger.ONE),
        "brown" to Pair(1, BigInteger.TEN),
        "red" to Pair(2, BigInteger("100")),
        "orange" to Pair(3, BigInteger("1000")),
        "yellow" to Pair(4, BigInteger("10000")),
        "green" to Pair(5, BigInteger("100000")),
        "blue" to Pair(6, BigInteger("1000000")),
        "violet" to Pair(7, BigInteger("10000000")),
        "grey" to Pair(8, BigInteger("100000000")),
        "white" to Pair(9, BigInteger("1000000000")),
    )

    var result = ""
    repeat(3) {
        if (it == 2) {
            result = (BigInteger(result) * map[readln()]!!.second).toString()
        } else {
            result += map[readln()]!!.first.toString()
        }
    }
    println(result)
}
