package org.example.lec16

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

fun main() {
    val person = Person("junyoung", "kang", 99)
    println(person.nextYearAge())
}