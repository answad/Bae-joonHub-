fun decryptMessage(K: Int, encrypted: String): String {
    val rowCount = encrypted.length / K
    val table = Array(rowCount) { CharArray(K) }

    var index = 0
    for (row in 0 until rowCount) {
        if (row % 2 == 0) {
            for (col in 0 until K) {
                table[row][col] = encrypted[index++]
            }
        } else {
            for (col in K - 1 downTo 0) {
                table[row][col] = encrypted[index++]
            }
        }
    }

    val result = StringBuilder()
    for (col in 0 until K) {
        for (row in 0 until rowCount) {
            result.append(table[row][col])
        }
    }

    return result.toString()
}

fun main() {
    val K = readln().toInt()
    val encrypted = readln()
    println(decryptMessage(K, encrypted))
}
