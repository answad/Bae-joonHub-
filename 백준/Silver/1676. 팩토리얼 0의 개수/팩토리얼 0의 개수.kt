fun main() {
    val n = readln().toInt()
    println(generateSequence(5) { it * 5 }.takeWhile { it <= n }.sumOf { n / it })
}
