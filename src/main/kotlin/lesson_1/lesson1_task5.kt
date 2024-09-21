package org.example.lesson_1

const val BASE_VALUE = 60
fun main() {
    val seconds = 6480
    val hourFormula = BASE_VALUE * BASE_VALUE
    val hour = seconds / hourFormula
    val minute = (seconds % hourFormula) / BASE_VALUE
    val remainingSeconds = seconds % BASE_VALUE

    val result = String.format("%02d:%02d:%02d", hour, minute, remainingSeconds)
    println(result)
}