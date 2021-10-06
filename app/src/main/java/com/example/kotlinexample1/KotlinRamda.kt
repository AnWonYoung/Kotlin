package com.example.kotlinexample1

// 1. Lamda
// 람다식은 value처럼 다룰 수 있는 익명함수다.
// 1) 메소드의 파라미터로 넘겨줄 수 있다. fun maxBy(a : Int) << 이 자리에 function 사용이 가능
// 2) return 값으로 사용할 수가 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}
//      람다이름    사용타입

fun main() {
    println(square(12))
    println(nameAndAge("won",26))

    val name1 = "Alice"
    val name2 = "Elly"

    println(name1.studying())
    println(name2.studying())

    println(studying2("won",26))

    val lamda = {number : Double ->
        number == 1.2323
    }

    println(lamdaExample(lamda)) // lamdaExample의 lamda와 같지 않았을 때 flase를 반환함
                                 //  람다식의 값을 또 다른 람다식에 넣을 수 있음
    val lamda2 = {number : Double -> number == 5.2323}

    println(lamdaExample(lamda2)) // 같을 때는 true를 반환함

    println(lamdaExample ({ it > 3.2}))
    lamdaExample{ it > 3.1 } // 위와 일차하는 코드임
                             // 마지막 파라미터 값이 람다식일 때 it을 사용


}
// 기본 람다식
// 타입추론이 가능하려면 {} 안, 혹은 그 전에 한 곳이든 타입을 선언
val square : (Int) -> (Int) = {number -> number*number} // number에서 타입 추론을 함
val nameAndAge = {name : String, age : Int -> "이름 - ${name}, 나이 - ${age}"}

// 1-2 람다식 확장함수
// 변수명 : 타입.() -> 리턴 타입 = { 리턴하는 값 }
val studying : String.() -> String = {
    this + "is studying"
}

fun studying2(name : String, age : Int) : String {
    // 람다식 안에 age 값을 넣기
    val inAgeLamda : String.(Int) -> String = {
        "This를 출력하기 ${this} || 나이를 출력하기 ${it}" // this는 현재 String 값, it은 예약어로 age를 가르킴
    }
    return name.inAgeLamda(age)
}

// 람다식의 Return = 마지막 한 줄

val calculateGrade : (Int) -> String = {
    when(it) {
        in 10..50 -> " 성적 : C "
        in 51..80 -> " 성적 : B "
        in 81..100 -> " 성적 : A"
//      람다식은 반드시 하나를 return 값으로 정해주어야 하는데
//      범위 밖의 숫자를 넣었을 때도 함께 고려를 해주어야 함
        else -> "10~100점만 가능합니다"
    }
}

// 1-4 람다를 표현하는 여러 방법
// input type과 output type을 명시하기
fun lamdaExample(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2323)
}

fun lamdaExaple2(lamda: (Int) -> Boolean) : Boolean {
    return lamda(1)
}

// 익명 내부함수가 아래의 조건을 만족하면 람다식을 사용할 수 있다.
// Kotlin interface가 아닌, Java interface에서 사용할 수 있다.
// 해당 interface 안에서는 반드시 하나의 메소드만 존재해야 한다.