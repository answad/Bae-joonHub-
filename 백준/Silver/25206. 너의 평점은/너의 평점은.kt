import java.math.BigDecimal

fun main() {
    val list = List(20) {
        readln().split(" ")
    }.filterNot { it[2] == "P" }

    val gradeMap = mapOf(
        "A+" to 4.5,
        "A0" to 4.0,
        "B+" to 3.5,
        "B0" to 3.0,
        "C+" to 2.5,
        "C0" to 2.0,
        "D+" to 1.5,
        "D0" to 1.0,
        "F" to 0.0
    )
    val sum = list.sumOf { BigDecimal(it[1]) }

    println(
        list.sumOf { BigDecimal(it[1]) * BigDecimal(gradeMap[it[2]]!!) }.divide(sum,6,BigDecimal.ROUND_HALF_UP )
    )
}