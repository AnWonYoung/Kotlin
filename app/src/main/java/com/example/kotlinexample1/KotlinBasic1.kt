package com.example.kotlinexample1

// main 함수
fun main() { // << 실행이 가능한 함수
    helloWorld()
    println(add(4,5))
}

// 1. 함수
// 무엇을 return 하든 앞에 함수는 무조건 fun으로 시작

fun helloWorld() : Unit {
//    return하는 값이 없을 때 : Unit을 함께 적어준다
//    Unit은 Redundant,안 써도 됨
    println("Hello World")

}

// 자바랑 다른 점 : 변수명을 먼저 적고 타입을 적으며 반환하는 타입도 함께 적어줘야 함
// int 사용 불가, 앞에는 무조건 대문자
// 여기서는 Redundant가 아니므로 반드시 타입을 적어주기 ( : Int )
fun add(a : Int, b : Int) : Int {
    return a+b;
}

// val과 var의 차이
// val = value를 의미하며, 값이 바뀌지 않음

fun example() {
    val a : Int = 10
    var b : Int = 9
    var e : String // 값을 당장 할당하지 않을 때는 타입만 적어두기
//    a = 100 (( Val cannot be reassigned )) < 값을 변동할 수 없음
    b = 100

    val c = 100 // 정석으로 변수를 할당 및 선언하는 방법이지만 쓰지 않아도 Kotlin은 Int 타입인 걸 앎
    var d = 100

    var name = "Won"
}