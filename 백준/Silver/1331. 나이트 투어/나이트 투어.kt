import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val map = mutableListOf<String>()
    fun input(input: String) = when (input) {
        "A" -> 1
        "B" -> 2
        "C" -> 3
        "D" -> 4
        "E" -> 5
        "F" -> 6
        else -> {
            0
        }
    }

    var isValid = true
    for (index in 0 until 36) {
        val inputString = sc.next()
        val firstPart = input(inputString[0].toString())
        val secondPart = inputString[1].toString().toInt()

        if (map.isNotEmpty() && index != 0) {
            val lastInputString = map.last()
            val listFirst = input(lastInputString[0].toString())
            val listSecond = lastInputString[1].toString().toInt()

            if (!(kotlin.math.abs(firstPart - listFirst) == 1 && kotlin.math.abs(secondPart - listSecond) == 2)
                && !(kotlin.math.abs(firstPart - listFirst) == 2 && kotlin.math.abs(secondPart - listSecond) == 1)
                || inputString in map
            ) {
                isValid = false
                break
            }
        }
        map.add(inputString)
    }
    val mapFirstIndex = map.last()
    val firstPart = input(mapFirstIndex[0].toString())
    val secondPart = mapFirstIndex[1].toString().toInt()
    val lastInputString = map.first()
    val listFirst = input(lastInputString[0].toString())
    val listSecond = lastInputString[1].toString().toInt()
    if (
        !(kotlin.math.abs(firstPart - listFirst) == 1 && kotlin.math.abs(secondPart - listSecond) == 2)
        && !(kotlin.math.abs(firstPart - listFirst) == 2 && kotlin.math.abs(secondPart - listSecond) == 1)
    ) {
        isValid = false
    }

    if (isValid) {
        println("Valid")
    } else {
        println("Invalid")
    }
}