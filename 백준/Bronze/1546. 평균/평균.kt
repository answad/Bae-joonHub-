fun main() {
    val ko = readln()
    val list = readln().split(" ").map { it.toDouble() }
    val result = list.map { it / list.max() * 100 }.average()
    println(result)
}

