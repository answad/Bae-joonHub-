fun main() {
    val input = readln().toInt()

    var total = 0
    var progress = 0
    repeat(input / 3) {
        var value = input
        total = value / 5 - progress
        value -= 5 * total
        if (value % 3 == 0) {
            total += value / 3
            println(total)
            return
        }
        progress++
    }
    println(-1)
}