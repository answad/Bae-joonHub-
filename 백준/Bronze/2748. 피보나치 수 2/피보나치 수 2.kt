fun main() {
    val times = readln().toInt()
    print(
        if (times == 0) 0
        else generateSequence(0 to 1) { it.second to it.first + it.second }
            .take(times + 1)
            .last()
            .first
    )
}
