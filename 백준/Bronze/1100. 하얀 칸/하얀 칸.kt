fun main() {
    val input =
        (readln() + "." + readln() + "." + readln() + "." + readln() + "." + readln() + "." + readln() + "." + readln() + "." + readln()).chunked(
            2
        ).map { it.first() }.filter { it == 'F' }.size

    println(input)
}
