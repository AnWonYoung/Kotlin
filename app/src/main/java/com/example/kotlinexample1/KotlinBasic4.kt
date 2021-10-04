package com.example.kotlinexample1
// 5. Array와 List
// Array
// 1. List 2.MutableList (수정이 가능한 List)
fun main() {
    forAndWhile()
}

fun array() {
//  array와 list를 초기화하기
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d", 3.4f)
    val list2 = listOf(1,"n", 11L)

    array[0] = 3 //값 변동이 가능하다
//    list[0] = 2           불가능함, list는 하나의 interface 개념으로써 읽기 전용이 기본이다.
    var result = list.get(0) // 가져와서 get하여 result 안에 넣는 것만 가능함

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

//    arrayList = arrayListOf() || Val cannot be reassigned 에러 발생
//    본래의 주소값은 바뀌지 않으니 새롭게 초기화 할 수 없음

}

// ----------------반복문--------------------

fun forAndWhile() {
    val students = arrayListOf("won", "two", "three", "four")

    for(name in students) { // 반복문 문법 in
        println("${name}")
    }

    for( i : Int in 1..10) {
        print("${i}")
    }

//   구구단 찍기
    for(i : Int in 1..9) {
        for(j : Int in 1..9) {
            println("${i} * ${j} = ${i*j}")
        }
    }

}