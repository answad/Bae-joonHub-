fun main() {
    val input = readln().trim()
    println(if (input.isEmpty()) 0 else input.split("\\s+".toRegex()).size)
}
