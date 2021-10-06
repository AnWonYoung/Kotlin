package com.example.kotlinexample1

fun main() {
    val choiceBook1 = Book.create() // Book.object.create()
    println("${choiceBook1.id}, ${choiceBook1.name}")
    val testCompanion = Market.marketCompanion()
    println("${testCompanion.name}, ${testCompanion.number}")
}

// companion object = java의 static 대신 사용
// 정적인 메소드 or 변수를 선언할 때

class Book(val id : Int, val name : String) {
    companion object {
        fun create() = Book(1, "종의기원")
    }
}

class Market(val name : String, val number : Int) {
    companion object {
        fun marketCompanion() = Market("TestMarket", 5)
    }
}