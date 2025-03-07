fun main() {
    val times = readln().split(" ").last().toInt()
    var list = readln().split(",").map { it.toInt() }.toMutableList()

    repeat(times) {
        if (list.size <= 1) return@repeat
        val before = list.toList()
        list = MutableList(before.lastIndex) { i -> before[i + 1] - before[i] } 
    }

    println(list.joinToString(","))
}
