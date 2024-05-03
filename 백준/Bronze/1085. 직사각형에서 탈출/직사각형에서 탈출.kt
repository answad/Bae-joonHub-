import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val w = sc.nextInt()
    val h = sc.nextInt()

    val move = if (x > w && y > h) {
        x - w + y - h
    } else {
        minOf(
            if (x <= w) minOf(w - x, x)
            else 0,
            if (y <= h) minOf(h - y, y)
            else 0
        )
    }

    println(move)
}