fun main() {
    val list = readln().split(" ")
    listOf(1, 1, 2, 2, 2, 8).forEachIndexed { index, i ->
        print("${i - list[index].toInt()} ")
    }
}