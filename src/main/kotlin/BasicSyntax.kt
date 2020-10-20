import java.lang.Integer.parseInt

//fun sum(a:Int, b:Int): Int {
//    return a+b
//}

fun sum(a:Int, b:Int) = a+b

fun practiceSetLocalVariable() {
    val a: Int = 1  // 즉시 할당
    val b = 2       // 'Int' 타입으로 추론
    val c: Int      // 초기화를 하지 않으면 타입 필요
    c = 3           // 나중에 할당
}

fun practiceUsingStringTemplate() {
    var a = 1
    // 템플릿에서 단순 이름 사용:
    var s1 = "a is $a"

    a=2
    // 템플릿에서 임의의 식 사용:
    val s2 = "${s1.replace("is","was")}, but now is $a"

    println(s1)
    println(s2)
}

fun practiceUsingIf() {
    println(maxOf(1,2))
}

/*
fun maxOf(a: Int, b: Int) :Int {
    if(a>b) {
        return a
    }else {
        return b
    }
}
*/

// 조건 식 사용
fun maxOf(a:Int, b:Int) = if(a>b) a else b

// null 가능 값 사용과 null 검사
fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // x * y 코드는 에러가 발생하는데, 이유는 null을 가질 수 있기 때문이다.
    if(x != null && y != null) {
        // null 검사 이후에 x와 y를 자동으로 null 불가로 변환
        println(x * y)
    }else {
        println("either '$arg1' or '$arg2' is not a number")
    }
}

// 타입 검사와 자동 변환 사용
//fun getStringLength(obj: Any): Int? = if( obj is String) obj.length else null
fun getStringLength(obj: Any): Int? = if(obj is String && obj.length > 0) obj.length else null