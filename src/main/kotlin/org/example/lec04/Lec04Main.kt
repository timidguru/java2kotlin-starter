package org.example.lec04

fun main() {

//    val money1 = JavaMoney(2_000L)
//    val money2 = JavaMoney(1_000L)
//
//    if(money1 > money2) {
//        println("money1이 money2보다 큽니다")
//    }

//    val money1 = JavaMoney(1_000L)
//    val money2 = money1
//    val money3 = JavaMoney(1_000L)
//
//    println(money1 === money2)
//    println(money1 == money3)

//    if (fun1() || fun2()) {
//        println("본문 ")
//    }

    val money1 = Money(1_000L)
    val money2 = Money(2_000L)
    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}