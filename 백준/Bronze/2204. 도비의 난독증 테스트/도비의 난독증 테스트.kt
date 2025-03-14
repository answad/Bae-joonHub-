
fun main() {
    while (true) {
        val size = readln().toInt()
        if (size == 0) return
        val list = List(size) { readln() }
        println(list.minBy { it.lowercase()})
    }
}
