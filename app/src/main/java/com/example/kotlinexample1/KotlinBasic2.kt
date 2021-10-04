package com.example.kotlinexample1

fun main() {
    // 3. String Template

    val name = "Won"
    val lastname = "An"
    println("My name is $name") // 변수를 출력할 때는 S+변수명
    println("My name is ${name}띄어쓰기 안할 때") // {}로 사용하기
    println("My name is ${name + lastname}+를 사용해서 {}안에 모두 변수를 넣어 붙일 수 있음")

    println("This is 2\$a") // $를 표시하고 싶을 때는 \를 사용하기
}