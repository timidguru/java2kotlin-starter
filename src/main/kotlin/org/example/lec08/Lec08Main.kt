package org.example.lec08

import java.util.StringJoiner

fun main() {
//    repeat("Hello World")
//    repeat("Hello World", useNewLine = false)
//    printNameAndGender(name = "최태현", gender = "MALE")
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

//fun max(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    }
//    return b
//}

fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}