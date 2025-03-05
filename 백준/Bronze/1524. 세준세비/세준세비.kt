import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().toInt()

    repeat(T) {
        br.readLine()
        val (N, M) = br.readLine().split(" ").map { it.toInt() }
        val SGmax = br.readLine().split(" ").maxOf { it.toInt() }
        val SBmax = br.readLine().split(" ").maxOf { it.toInt() }
println(if (SGmax > SBmax) "S" else if (SGmax < SBmax) "B" else "S")
    }
}
