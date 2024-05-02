import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val rotn = sc.nextInt()

    var bundle = Int.MAX_VALUE
    var one = Int.MAX_VALUE

    repeat(sc.nextInt()) {
        bundle = minOf(bundle, sc.nextInt())
        one = minOf(one, sc.nextInt())
    }

    val totalPrice = minOf(
        one * rotn,
        bundle * (rotn / 6 + 1),
        bundle * (rotn / 6) + one * (rotn % 6)
    )

    println(totalPrice)
}