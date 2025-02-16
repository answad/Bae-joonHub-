fun main() = println(readln().split(" ").map { it.toInt() }.reduce { acc, num -> acc * num -1 })
