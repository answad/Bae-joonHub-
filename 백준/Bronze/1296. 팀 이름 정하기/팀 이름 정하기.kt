fun calculateProbability(L: Int, O: Int, V: Int, E: Int): Int {
    return ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100
}

fun main() {
    val yunCount = readln().trim().groupingBy { it }.eachCount()
    val teamNames = List(readln().toInt()) { readln().trim() }

    var maxProbability = -1
    var bestTeam = ""

    for (team in teamNames) {
        val teamCount = team.groupingBy { it }.eachCount()

        val probability = calculateProbability(
            yunCount.getOrDefault('L', 0) + teamCount.getOrDefault('L', 0),
            yunCount.getOrDefault('O', 0) + teamCount.getOrDefault('O', 0),
            yunCount.getOrDefault('V', 0) + teamCount.getOrDefault('V', 0),
            yunCount.getOrDefault('E', 0) + teamCount.getOrDefault('E', 0),
        )

        if (probability > maxProbability || (probability == maxProbability && team < bestTeam)) {
            maxProbability = probability
            bestTeam = team
        }
    }

    println(bestTeam)
}
