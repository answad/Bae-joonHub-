fun main() {
    repeat(readln().toInt()) {
        val (a, b) = readln().split(" ")
        for (i in b.split("")) {
            repeat(a.toInt()) {
                print(i)
            }
        }
        println()
    }
}
