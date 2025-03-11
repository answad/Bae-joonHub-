fun main() {
    val n = readln().toInt()
    val countMap = mutableMapOf<Char, Int>()
    repeat(n) {
        val firstChar = readLine()!![0]
        countMap[firstChar] = countMap.getOrDefault(firstChar, 0) + 1
    }
    val result = countMap.filterValues { it >= 5 }.keys.sorted() 
    if (result.isEmpty()) {
        println("PREDAJA")
    } else {
        println(result.joinToString(""))
    }
}
