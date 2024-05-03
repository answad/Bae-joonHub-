import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val qu = mutableListOf<Int>()
    val ans1 = mutableListOf<Int>()
    val n = sc.nextInt()

    for (index in 1 until n+1) {
        qu.add(index)
    }

    var int = 0
    while (qu.size > 1) {
        if (int % 2 == 0) {
            ans1.add(qu[0])
            qu.removeAt(0)
        } else {
            qu.add(qu[0])
            qu.removeAt(0)
        }
        int++
    }

    ans1.forEach {
        print(it)
        print(" ")
    }
    print(qu[0])
}
