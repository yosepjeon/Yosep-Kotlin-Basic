// DTO 생성(POJO/POCO)
data class Customer(val name: String, val email:String)

// 함수 파라미터의 기본 값
fun foo(a:Int=0, b:String=""){
    val a:Int = 3

    println("${a}")
    println("$a")
}
// list filtering
fun filterList(): Unit {
    val list = listOf<Int>(1, 2, 3, 4, 5)
    var positives1 = list.filter { x -> x > 0 }
    val positives2 = list.filter { it > 0 }

    println("positives1: " + positives1)
    println("positives2: " + positives2)
}

// 쌍으로 맵이나 목록 탐색
fun searchMap() {
    var map:Map<String,Int> = mutableMapOf("a" to 1, "b" to 2)
    map = map.plus("c" to 3)

    for((k,v) in map) {
        println("$k -> $v")
    }
}

// 지연(lazy) 프로퍼티
fun doLazyProperty() {
    val p: String by lazy {
        "a"
    }
    println(p)
}

// lambda
public fun lambdaFun() {
    val list = listOf<Int>(1,2,3,4,5)

    val list2 = list.filter { it % 2 == 0 }.map { it}
    println(list2)
}
