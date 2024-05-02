import java.util.Arrays
import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val N = sc.nextInt()
    val A = IntArray(N)
    val B = IntArray(N)

    A.forEachIndexed { index, _ -> A[index] = sc.nextInt() }

    B.forEachIndexed { index, _ -> B[index] = sc.nextInt() }

    Arrays.sort(A)
    Arrays.sort(B)
    var S = 0
    for (i in 0 until N) {
        S += A[i] * B[N - 1 - i]
    }
    println(S)
}