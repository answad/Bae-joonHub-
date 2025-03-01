fun main() {
    readln()
    val divisors = readln().split(" ").map { it.toInt() }
    println(divisors.min() * divisors.max())
}
