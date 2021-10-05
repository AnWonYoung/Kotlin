package com.example.kotlinexample1
// 자바와 차이
// 파일명이 클래스명과 같지 않아도 됨
// 여러 클래스도 한 파일 안에 넣을 수 있음


class Human constructor(name : String) {
//  생성자 문법도 자바와 차이가 있음
    fun eatingCake() {
        println("This is so Yummyy")
    }
    val name = "won"
}

class Human2 constructor(name : String = "default값 주기") {
    //  생성자 문법도 자바와 차이가 있음
    val name = name
}
// 주생성 및 부생성자
class Human3 constructor(name : String = "default값 주기") {
    constructor(name : String, age : Int) : this(name) { // this(name)처럼 주생성자의 값을 함께 받아야 함
        println("My name is ${name}, ${age}years old")
    }
    init { // init 함수를 통해서 코드블럭을 실행 (주생성자의 역할을 할당 받아 함께 출력됨)
        println("New Human has been born!")
    }
}

fun main() {
//  자바처럼 new로 새롭게 정의하지 않아도 됨
    val human = Human("이름 안 넣으면 에러") // constructer 생성자를 사용했으면 그에 맞는 타입을 넣어야 함
    human.eatingCake()

    println("This human's name is ${human.name}")

    val human2 = Human2() // default 값을 주면 따로 값을 주지 않아도 됨
    println("human2 Class에 default값을 주었을 때 : ${human2.name}")

//  부생성자 찍어보기
//  주의! 해당 Class에서 init먼저 실행된 다음에 constructer 실행
//  즉, 주생성자 -> 부생성자 순으로 실행이 된다
    val human3 = Human3("won", 26)
}