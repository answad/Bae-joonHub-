fun main() {
    val input = List(readln().toInt()) {
        readln().toInt()
    }.toMutableList()

    var isSorted: Boolean
    repeat(input.size) {
        isSorted = true
        repeat(input.size - 1) { i ->
            if (input[i] > input[i + 1]) {
                val temp = input[i]
                input[i] = input[i + 1]
                input[i + 1] = temp
                isSorted = false
            }
        }

        if (isSorted) {
            return@repeat
        }
    }

    input.forEach(::println)
}
