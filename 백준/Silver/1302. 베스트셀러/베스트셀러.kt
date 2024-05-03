import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var list = mutableMapOf<String, Int>()
    repeat(sc.nextInt()) {
        val cs = sc.next()
        if (cs in list) {
            list[cs] = list[cs]!! + 1
        } else {
            list[cs] = 1
        }
    }

    println( findKeyByValue(list.toSortedMap(),list.values.max()))
}

fun <K, V> findKeyByValue(map: Map<K, V>, value: V): K? {
    return map.entries.find { it.value == value }?.key
}