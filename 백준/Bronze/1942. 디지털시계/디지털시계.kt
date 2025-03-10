fun main() {

    fun toInt(timeList: List<String>): Int {
        return timeList[0].toInt() * 10000 + timeList[1].toInt() * 100 + timeList[2].toInt()
    }

    repeat(3) {
        val (start, end) = readln().split(" ").map { it.split(":").map { it.toInt() }.toMutableList() }
        var count = 0

        while (true) {
            val startTime = toInt(start.map { it.toString() })
            val endTime = toInt(end.map { it.toString() })

            if (startTime % 3 == 0) count++

            if (startTime == endTime) break

            start[2]++
            if (start[2] == 60) {
                start[2] = 0
                start[1]++
                if (start[1] == 60) {
                    start[1] = 0
                    start[0]++
                    if (start[0] == 24) start[0] = 0
                }
            }
        }

        println(count)
    }
}
