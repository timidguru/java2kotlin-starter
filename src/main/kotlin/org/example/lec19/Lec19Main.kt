package org.example.lec19

import org.example.lec17.Fruit
import org.example.lec19.a.printHelloWorld as printHelloWorldA
import org.example.lec19.b.printHelloWorld as printHelloWorldB

//class Person(
//    val name: String,
//    val age: Int
//) {
//    operator fun component1(): String {
//        return this.name
//    }
//
//    operator fun component2(): String {
//        return this.age
//    }
//}

data class Person(
    val name: String,
    val age: Int
)

fun main() {
//    printHelloWorldA()
//    printHelloWorldB()

//    val person = Person("최태현", 100)
//    val (name, age) = person
//    println("이름 : ${name}, 나이 : ${age}")

//    val numbers = listOf(1, 2, 3, 4, 5)
//    run {
//        numbers.forEach { number ->
//            if (number == 3) {
//                return@run // break
//            }
//            println(number)
//        }
//    }
//    numbers.forEach { number ->
//        if (number == 3) {
//            return@forEach // continue
//        }
//        println(number)
//    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if(j == 2) {
                break@loop
            }
            println("${i} ${j}")
        }
    }

}

var number: Int = 1
fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}
fun getNumberOrNullV2(): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullV3(): Int? {
    return number.takeUnless { it <= 0 }
}

//typealias FruitFilter = (Fruit) -> Boolean
//
//private fun filterFruits(
//    fruits: List<Fruit>, filter: FruitFilter
//): List<Fruit> {
//    return fruits.filter(filter)
//}
