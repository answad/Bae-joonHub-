
fun main() {
    val repeat = readlnOrNull() ?: return
    repeat(repeat.toInt()) {
        val input = readlnOrNull() ?: return
        val list = input.toMutableList()

        while (true) {
            if (list.size % 2 == 1) {
                println("NO")
                break
            } else if (list.isEmpty()) {
                println("YES")
                break
            }

            var found = false
            list.forEachIndexed { index, it ->
                if (index < list.size - 1 && it == '(' && list[index + 1] == ')') {
                    list[index] = ' '
                    list[index + 1] = ' '
                    found = true
                }
            }

            list.removeIf { it == ' ' }

            if (!found) {
                println("NO")
                break
            }
        }
    }
}
