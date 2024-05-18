fun main() {
    val (first, sec) = readln().split(" ")
    var maxMatches = 0

    for (start in 0..(sec.length - first.length)) {
        var matches = 0
        for (i in first.indices) {
            if (first[i] == sec[start + i]) {
                matches++
            }
        }

        if (matches > maxMatches) {
            maxMatches = matches
        }
    }
    println(first.length - maxMatches)
}
