fun main() {
    val times = readln().toInt()
    print(
        if (times == 0) 0
        else generateSequence(0L to 1L) { it.second to it.first + it.second }
            .take(times + 1)
            .last()
            .first
    )
}
