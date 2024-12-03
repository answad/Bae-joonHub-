fun main() {
    val input = System.`in`.bufferedReader()
    val output = System.out.bufferedWriter()

    val n = input.readLine().toInt()
    val numbers = IntArray(n) { input.readLine().toInt() }

    mergeSort(numbers.toList())
        .reversed()
        .forEach { output.write("$it\n") }

    output.flush()
    output.close()
}

fun mergeSort(list: List<Int>): List<Int> {
    if (list.size <= 1) return list
    val mid = list.size / 2
    return merge(
        mergeSort(list.subList(0, mid)),
        mergeSort(list.subList(mid, list.size))
    )
}

fun merge(left: List<Int>, right: List<Int>): List<Int> {
    val merged = mutableListOf<Int>()
    var (i, j) = 0 to 0

    while (i < left.size && j < right.size) {
        merged.add(if (left[i] <= right[j]) left[i++] else right[j++])
    }

    merged.addAll(left.subList(i, left.size))
    merged.addAll(right.subList(j, right.size))

    return merged
}
