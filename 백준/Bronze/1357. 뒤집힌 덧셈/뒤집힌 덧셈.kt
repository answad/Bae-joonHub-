fun main() {
    val (X, Y) = readln().split(" ").map { it.reversed().toInt() }
    val result = (X + Y).toString().reversed().toInt()
    println(result)
}
