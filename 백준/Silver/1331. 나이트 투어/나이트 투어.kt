import kotlin.math.abs

fun main() {
    val moves = List(36) { readln() }
    val knightMoves = listOf(
        2 to 1, 2 to -1, 1 to 2, 1 to -2,
        -1 to 2, -1 to -2, -2 to 1, -2 to -1
    )

    fun isValidMove(from: String, to: String): Boolean {
        val x1 = from[0] - 'A'
        val y1 = from[1] - '1'
        val x2 = to[0] - 'A'
        val y2 = to[1] - '1'
        
        return knightMoves.any { (dx, dy) -> x1 + dx == x2 && y1 + dy == y2 }
    }

    val visited = mutableSetOf<String>()

    repeat(36) { i ->
        if (moves[i] in visited) {
            println("Invalid")
            return
        }
        visited.add(moves[i])

        if (i > 0 && !isValidMove(moves[i - 1], moves[i])) {
            println("Invalid")
            return
        }
    }

    if (!isValidMove(moves[35], moves[0])) {
        println("Invalid")
        return
    }

    println("Valid")
}
