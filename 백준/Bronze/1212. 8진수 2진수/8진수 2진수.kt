fun main() {
    val result = readln().map {
        when (it) {
            '0' -> "000"
            '1' -> "001"
            '2' -> "010"
            '3' -> "011"
            '4' -> "100"
            '5' -> "101"
            '6' -> "110"
            '7' -> "111"
            else -> ""
        }
    }.joinToString("")

    println(result.trimStart('0').ifEmpty { "0" })
}
