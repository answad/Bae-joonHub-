fun main() {
    var list = readln()

    listOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=").forEach {
        list = list.replace(it, "0")
    }
    print(list.length)
}