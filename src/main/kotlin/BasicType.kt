fun test() {
    // Java 플랫폼에서 숫자형은 JVM primitive type으로 저장됨
    // Nullable이나 제네릭의 경우에는 박싱됨
    // 박싱된 경우 identity를 유지하지 않음
    var a: Int = 10000
    var b: Int? = 10000
    println("a === b: ${a === b}")
    println("a == b : ${a == b}")
}

// 숫자 리터럴에 밑줄
fun numberLiteralUnderBar() {
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val byte = 0b11010010_01101001_10010100_10010010

    println(oneMillion)
    println(creditCardNumber)
    println(socialSecurityNumber)
    println(hexBytes)
    println(byte)
}

//