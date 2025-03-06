fun main() {
    val n = readln().toInt()
    for (i in n downTo 4) {
        if (i.toString().all { it == '4' || it == '7' }) {
            println(i)
            return
        }
    }
}
