package org.example.lec20

import org.example.lec19.Person

fun printPerson(person: Person?) {

    if (person != null) {
        println(person.name)
        println(person.age)
    }

    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun useLet() {
    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }
        .filter { it > 3 }
//        .let(::println)
        .let { lengths -> println(lengths) }
}

fun useLst2(str: String?) {
    // non-null 값에 대해서만 code block을 실행시킬 때
    val length = str?.let {
        println(it.uppercase())
        it.length
    }
}

fun useAlso() {

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    val numbers = mutableListOf("one", "two", "three");
    println("The list elements before adding new one: $numbers")
    numbers.add("four")
}