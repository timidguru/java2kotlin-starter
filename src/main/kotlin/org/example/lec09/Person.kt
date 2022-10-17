package org.example.lec09

//class Person constructor((name: String, age: Int){
//
//    val name: String = name
//    var age: Int = age
//}

//fun main() {
////    val person = Person("최태현", 100)
//    val person = JavaPerson("최태현", 100)
//    println(person.name)
//    person.age = 10
//    println(person.age)
//}

fun main() {
//    val person = Person("최태현")
    val person = Person()
}

class Person(
    name: String = "최태현",
    var age: Int = 1
) {

//    val name = name
//        get() = field.uppercase()

//    fun getUppercaseName(): String {
//        return this.name.uppercase()
//    }

//    val uppercaseName: String
//        get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

//    constructor(name: String): this(name, 1) {
//        println("첫 번째 부생성자")
//    }
//
//    constructor(): this("홍길동") {
//        println("두 번째 부 생성자")
//    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    val isAdult: Boolean
        get() = this.age >= 20
}