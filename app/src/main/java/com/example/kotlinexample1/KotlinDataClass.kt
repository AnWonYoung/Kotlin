package com.example.kotlinexample1

fun main() {

    val ticket1 = Ticket("아시아 항공", "Won", 14, "2021-10-06")
    val ticket2 = Ticket2("아시아 항공", "Won", 14, "2021-10-06")

    println(ticket1) // 출력결과 Ticket(companyName=아시아 항공, name=Won, seatNumber=14, data=2021-10-06) << 타입이 모두 나옴
                     // 객체 안에 들어가 있는 값이 한 번에 출력되어서 알아보기 용이함
    println(ticket2) // 원래는 객체의 주소값이 나와야 함
}
// 에시) 비행기
data class Ticket(val companyName : String, val name : String, var seatNumber : Int, var data : String)
// toString(), hashCode(), copy(), equals() 메소드가 안에 다 들어가 있는 것
class Ticket2(val companyName : String, val name : String, var seatNumber : Int, var data : String)