fun main() {
    val list = List(9) {
        readln().split(" ")
    }

    var maxValue = 0
    var x = 1
    var y = 1

    list.forEachIndexed { yIndex, xList ->
        xList.forEachIndexed { xIndex, item ->
            val value = item.toInt()
            if (value > maxValue) {
                maxValue = value
                y = yIndex + 1
                x = xIndex + 1
            }
        }
    }
    println(maxValue)
    println("$y $x")
}