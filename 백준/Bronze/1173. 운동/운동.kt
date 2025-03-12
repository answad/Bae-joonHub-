fun main() {
    val (n, m, M, T, R) = readln().split(" ").map { it.toInt() }

    var currentBpm = m
    var rest = 0
    var work = 0
    if (M - m < T) {
        println("-1")
        return
    }
    while (work < n) {
        if (currentBpm + T <= M) {
            currentBpm += T
            work++
        } else {
            if (currentBpm - R < m) {
                rest++
                currentBpm = m
                continue
            }
            rest++
            currentBpm -= R
        }
    }
    println(work + rest)
}