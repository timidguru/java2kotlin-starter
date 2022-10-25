package org.example.lec18

import org.example.lec17.Fruit

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    filterFruits(fruits) { fruit -> fruit.name == "사과" }

}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    return fruits.filter(filter)
}