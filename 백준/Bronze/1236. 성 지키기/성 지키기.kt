import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (vertical, horizontal) = readLine().split(" ")
    val occupiedRows = mutableSetOf<Int>()
    val occupiedColumns = mutableSetOf<Int>()

    repeat(vertical.toInt()) { verticalIndex ->
        val row = readLine().toCharArray() 
        repeat(horizontal.toInt()) { horizontalIndex ->
            if (row[horizontalIndex] == 'X') {
                occupiedRows.add(verticalIndex)
                occupiedColumns.add(horizontalIndex)
            }
        }
    }

    val missingRows = vertical.toInt() - occupiedRows.size
    val missingColumns = horizontal.toInt() - occupiedColumns.size

    println(maxOf(missingRows, missingColumns))
}
