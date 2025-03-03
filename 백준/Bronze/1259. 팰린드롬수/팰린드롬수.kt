fun main() {
    while (true) {
        val number = readln()
        if (number.toInt() == 0) break
        if (number == number.reversed()) {
            println("yes")
        } else {
            println("no")
        }
    }
}