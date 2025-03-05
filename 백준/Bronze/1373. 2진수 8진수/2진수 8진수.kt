import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var input = nextLine()

    if (input.length % 3 == 1) input = "00$input"
    else if (input.length % 3 == 2) input = "0$input"

    for (i in input.chunked(3)) {
        print(
            i[0].toString().toInt() * 4
                    + i[1].toString().toInt() * 2
                    + i[2].toString().toInt()
        )
    }
}