fun main() {
    val daysInMonth = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    val daysOfWeek = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

    val (month, day) = readln().split(" ").map { it.toInt() }

    var totalDays = 0

    for (i in 0 until month - 1) {
        totalDays += daysInMonth[i]
    }

    totalDays += day

    println(daysOfWeek[(totalDays - 1) % 7])
}
