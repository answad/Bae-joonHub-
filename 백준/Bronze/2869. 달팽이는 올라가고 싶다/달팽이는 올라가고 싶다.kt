import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.ceil

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val (A, B, V) = reader.readLine().split(" ").map { it.toInt() }

    val days = ceil((V - B).toDouble() / (A - B)).toInt()
    println(days)
}
