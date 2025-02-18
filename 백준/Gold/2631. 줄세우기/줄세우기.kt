fun main() {
    val n = readln().toInt()
    val input = List(n) { readln().toInt() }
    val mock = IntArray(input.size) { 1 }

    mock.forEachIndexed { i, _ ->
        for (j in 0 until i) {
            if (input[j] < input[i]) {
                mock[i] = maxOf(mock[i], mock[j] + 1)
            }
        }
    }

    println(n - (mock.maxOrNull() ?: 0))
}
