fun main() {
    val times = readln().toInt()
    var pair = Pair(0L, 1L)
    when (times) {
        0 -> print(0)
        1 -> print(1)
        else -> {
            repeat(times - 1) {
                pair = Pair(pair.second, pair.first + pair.second)
            }
            print(pair.second) 
        }
    }
}