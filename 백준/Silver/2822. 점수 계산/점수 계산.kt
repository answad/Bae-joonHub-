fun main() {
    val list = List(8) { readln().toInt() }
    val top5 = list.sortedDescending().take(5)
    println(top5.sum())
      list.withIndex()
        .filter { it.value in top5 }
        .map { it.index + 1 } 
        .sorted()
        .forEach { print("$it ") }
}
