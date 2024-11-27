fun main() {
    repeat(readln().toInt()) {
        val list = readln().toMutableList()
        
        while (list.isNotEmpty()) {
            var found = false
            for (i in 0 until list.size - 1) {
                if (list[i] == '(' && list[i + 1] == ')') {
                    list.subList(i, i + 2).clear()
                    found = true
                    break
                }
            }

            if (!found) {
                println("NO")
                break
            }
        }
        
        if (list.isEmpty()) {
            println("YES")
        }
    }
}
