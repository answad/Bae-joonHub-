fun main(args: Array<String>) {
    var (_, kimRound, limRound) = readln().split(" ").map { it.toInt() }

    var round = 0

    while (kimRound != limRound) {
        kimRound = (kimRound + 1) / 2
        limRound = (limRound + 1) / 2
        round++
    }

    println(round)
}