package com.example.kotlinexample1
// 조건식
fun main() {
    checkNum(1)
}

fun maxBy(a : Int, b : Int) : Int {
    if(a > b) {
        return a
    } else {
        return b
    }
}
// 간결한 삼항연산자
fun maxBy2(a : Int, b : Int) : Int = if(a>b) a else b

// if, when 자주 사용
// 특히 Kotlin에서는 switch 역학을 할 수 있다
fun checkNum(score :  Int) {
    when(score) {
        0 -> println("This is 0")
        1 -> println("This is 1")
        2,3 -> println("This is 2 or 3") // 복수도 가능
    }
    var b = when(score) {
        1->1
        2->2
//      이렇게 return으로 사용이 가능하다.
        else -> 3 // 다만 이때는 else를 명시할 것
    }

    println("b : ${b}")

    when(score) {
        in 90..100 -> println("You are genius") // 90~100점 시 출력
        in 10..80 -> println("not bad") // 10~80점 시 출력
        else -> println("okay") // 조건에 없는 81~89점, 그 외 int 값도 여기서 걸림
    }
}

// Expression vs Statement
// 값의 반환 유무의 차이를 가지고 있음.
// 모든 fun, 즉 함수는 모두 Expression이다.
// 리턴 값이 없어도 Unit을 리턴하고 있다.
// 자바의 void는 Statement라고 할 수 있음.