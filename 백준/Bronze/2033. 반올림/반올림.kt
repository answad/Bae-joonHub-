fun main() {
    var n = readln().toInt()
    var f = 10
    while (n >= f) {
        n = (n + f / 2) / f * f
        f *= 10
    }
    println(n)
}
