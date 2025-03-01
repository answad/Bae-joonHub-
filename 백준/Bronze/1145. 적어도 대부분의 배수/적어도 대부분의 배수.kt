fun main() {
    val num = readln().split(" ").map { it.toInt() }
    var sum = 1
    while (true) {
        val count = num.count { sum % it == 0 }
        if (count >= 3) {
            println(sum)
            return
        }
        sum++
    }
}
