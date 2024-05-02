import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val length = sc.nextInt()
    val string = mutableListOf<Char>()

    repeat(length) {
        val input = sc.next()
        input.toCharArray().forEachIndexed { index, it ->
            if (index < string.size) {
                if (string[index] == it) {
                    string[index] = it
                } else {
                    string[index] = '?'
                }
            } else {
                string.add(it)
            }
        }
    }

    println(string.joinToString(""))
}