package org.example.lec14

fun main() {
    val person1 = PersonDto("강준영", 99)
    val person2 = PersonDto("강준영", 2)
    println(person1.toString())
    println(person1.hashCode())
    println(person2.hashCode())
    println(person1 == person2)
}

data class PersonDto(
    val name: String,
    val age: Int
) {
}