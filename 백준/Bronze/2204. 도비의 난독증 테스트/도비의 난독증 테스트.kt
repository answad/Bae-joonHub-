fun main() {
    while (true) {
        val n = readln().toInt()
        if (n == 0) return

        val words = List(n) { readln() }
        val minWord = words.minBy { it.lowercase() }

        println(minWord)
    }
}
