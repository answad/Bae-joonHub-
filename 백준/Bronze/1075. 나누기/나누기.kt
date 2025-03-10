fun main() {
    val input = readln().toInt() / 100 * 100
    val div = readln().toInt()
    var result = 0
    var add = 0
    while (input > result) {
        result += div
        add++
    }
    println(String.format("%02d", result % 100))
}
