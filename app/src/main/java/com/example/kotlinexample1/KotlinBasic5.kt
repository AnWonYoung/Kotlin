package com.example.kotlinexample1

fun main() {
    nullcheck()
    nullLet()
}

// 7. Nullable / NonNull
// 자바와의 가장 큰 특징! Null을 컴파일 시기에 잡을 수 있음
// 원래는 돌려봐야 알 수 있음 (자바 언어 기준)
fun nullcheck() {
    var name : String = "won"

    var nullName : String? = null // ? Nullable 타입이 가능하여 null이 될 수도, 안 될 수도 있도록 함
                                  // 또한 이때는 타입 생략이 불가능함
    var nameInUpperCase = name.uppercase()
    var nullNmaeInUpperCase = nullName?.uppercase() // ?룰 붙이지 않으면 미리 null임을 알 수 있도록 함
                                                    // null이면 전체가 null을 반환(해당 String타입이 추론하여 null을 인식), 아니면 upperCase를 반환

    // ?: = default값을 주고 싶을 때

    val lastName : String? = null
    val fullName : String = name + " "+ (lastName?: "No lastName") //lastName이 null이 아니면 그대로 출력, null이면 No lastName을 출력

    println(fullName)

}
// !! >> null이 절대 아니라는 걸 알려줌
// 다만 사용하는 건 지양해야 함 > 아닐 때는 무조건 NBE를 발생시킴

fun ignoreNulls(str : String?) {
    val notNull : String = str!! // 지금은 null이지만 !!를 붙이면 컴파일 에러를 발생시키지 않음
    val upper : String = notNull.uppercase()
}

fun nullLet() {
    val email = "aaa@naver.com"
    email?.let { // let읈 사용하면서 email을 람다식 내부로 옮겨준다
                // null이 아니면 안으로 옮겨준다는 말
        println("my email is ${email}") // null이면 출력되지 않아서 안전성을 높일 수 있음
    }
}