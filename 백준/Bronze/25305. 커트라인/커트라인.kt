fun main() {
    val (n, k) = readln().split(" ")
    val scores = readln().split(" ").map { it.toInt() }.sortedDescending()
    println(scores[k.toInt() - 1])
}