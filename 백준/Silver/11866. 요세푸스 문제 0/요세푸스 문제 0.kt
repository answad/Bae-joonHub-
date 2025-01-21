fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val list1 = (1..n).toMutableList()
    var index = 0
    print("<")
    while (list1.isNotEmpty()) {
        index = (index + k - 1) % list1.size // 원형 순환 인덱스 계산
        print("${list1[index]}")
        list1.removeAt(index)
        if(list1.isNotEmpty()) print(", ")
    }
    print(">")
}
