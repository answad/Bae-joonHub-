fun main() {
    val X = readln().toInt()
    
    var line = 1
    while (X > line * (line + 1) / 2) { 
        line++
    }

    val prevSum = line * (line - 1) / 2 
    val pos = X - prevSum
    
    val numerator: Int
    val denominator: Int

    if (line % 2 == 0) {
        numerator = pos
        denominator = line - pos + 1
    } else {
        numerator = line - pos + 1
        denominator = pos
    }

    println("$numerator/$denominator")
}
