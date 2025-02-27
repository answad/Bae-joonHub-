fun main() {
    val input = readln()
    val digits = input.toList().toMutableList() 
    for (i in digits.indices) {
        for (j in 0 until digits.size - 1 - i) {
            if (digits[j] < digits[j + 1]) {
                val temp = digits[j]
                digits[j] = digits[j + 1]
                digits[j + 1] = temp
            }
        }
    }

    println(digits.joinToString(""))
}
