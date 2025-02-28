
fun main() = with(System.`in`.bufferedReader()) {
    val list = List(readLine().toInt()) {
        readLine()
    }.sorted().sortedBy { it.length }
    list.distinct().forEach(::println)
}
