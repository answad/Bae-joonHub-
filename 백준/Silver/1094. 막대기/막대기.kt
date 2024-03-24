fun main() {
    var X = readLine()!!.toInt() // X 값 입력받기
    var currentLength = 64 // 처음 가지고 있는 막대의 길이
    var count = 0 // 필요한 막대의 개수

    while (X > 0) {
        if (currentLength > X) {
            currentLength /= 2 // 막대를 절반으로 자르기
        } else {
            X -= currentLength // 필요한 길이에서 현재 막대 길이를 빼기
            count++ // 필요한 막대 개수 증가
        }
    }

    println(count) // 필요한 막대의 개수 출력
}
