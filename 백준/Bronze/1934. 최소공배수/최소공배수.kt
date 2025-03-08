fun main() {
    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ").map { it.toInt() }

        var x = a
        var y = b
        while (y != 0) {
            val temp = x % y
            x = y
            y = temp
        }

        println(a * b / x)
    }
}