import java.util.*
fun main() {
    val s=Scanner(System.`in`)
    var n=s.nextInt()
    var l=s.nextInt()+5
    var d=s.nextInt()
    var num=0
    var time=d
    for(i in 0 until n){
        num+=l
        while(true){
            if(time<num-5) time+=d
            else break
        }
        if(num-5<=time&&time<num) break
    }
    print(time)
}

// 블로그 코드...