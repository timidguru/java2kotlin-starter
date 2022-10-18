package org.example.lec10

abstract class Animal(
    protected val species: String,
    protected open val lecCount: Int
) {
    abstract fun move()
}