fun main() {
    val input = List(5) {
        readln().toInt()
    }.sorted()
    ((input.sum()) / input.size).run { println(this) }
    println(input[2])
}

// 진짜 정렬 안쓰고 못푸는건가