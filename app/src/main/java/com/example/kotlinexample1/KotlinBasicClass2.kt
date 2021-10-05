package com.example.kotlinexample1
// 상속 Class
// 같은 패키지 않에 동일 명의 class명은 사용 불가능

fun main() {
    val korean1 = Korean()
    korean1.song()
}

open class PerSon() {
   open fun song() { // open으로 오버라이드 할 수 있도록
        println("Sing a Song")
    }
}

class Korean() : PerSon() {
// 오버라이딩 할 때 내가 쓸 함수를 열어주기
    override fun song() {
        println("노래 부르기")
    }
}