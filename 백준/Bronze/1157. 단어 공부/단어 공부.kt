fun mostFrequentChar(word: String): Char {
    val lowerWord = word.toUpperCase()
    val frequencyMap = lowerWord.groupingBy { it }.eachCount()
    val maxCount = frequencyMap.values.maxOrNull() ?: return '?'
    val mostCommon = frequencyMap.filter { it.value == maxCount }.keys
    return if (mostCommon.size > 1) {
        '?'
    } else {
        mostCommon.first()
    }
}

fun main() {
        val word = readLine()?.trim() ?: return
    println(mostFrequentChar(word))
}
