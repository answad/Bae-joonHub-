import java.util.Scanner
import java.util.StringTokenizer

fun main(args: Array<String>) = with(System.`in`.bufferedReader()) {
    val L = readLine().toInt()
    val st = StringTokenizer(readLine())
    val N = readLine().toInt()
    var max = 0
    var min = 1001
    var ans = 0
    for (i in 0 until L) {
        val tmp = st.nextToken().toInt()
        if (tmp in (max + 1)..N) max = tmp
        if (tmp in (N + 1) until min) min = tmp
    }

    if (min != 1001 && N != max) ans = (N - max) * (min - N) - 1
    println(ans)
}
