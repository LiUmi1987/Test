package org.example.lesson_2
fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    val crystalOreBuff = (crystalOre * buff).toInt()
    val ironOreBuff = (ironOre * buff).toInt()

    println("Добыто кристаллической руды + $crystalOreBuff")
    println("Добыто железной руды + $ironOreBuff")

}