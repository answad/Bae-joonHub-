fun main() {
    val (A, B) = readln().split(" ").map { it.toInt() }

    val lsit = mutableListOf<Int>()
    var num = 1

    while (lsit.size < B) {
        repeat(num) { lsit.add(num) }
        num++
    }

    println(lsit.subList(A - 1, B).sum())
}
