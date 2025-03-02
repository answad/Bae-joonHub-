import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stack = mutableListOf<Int>()
    repeat(readLine().toInt()) {
        when (val input = readLine()) {
            "top" -> println(if (stack.isEmpty()) -1 else stack.last())
            "size" -> println(stack.size)
            "empty" -> println(if (stack.isEmpty()) 1 else 0)
            "pop" -> {
                if (stack.isNotEmpty()) {
                    println(stack.removeAt(stack.lastIndex))
                } else println(-1)
            }
            else -> stack.add(input.split(" ")[1].toInt())
        }
    }
}