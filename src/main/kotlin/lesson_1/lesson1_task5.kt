package org.example.lesson_1

const val baseValue = 60
fun main() {
    val seconds = 6480
    val hourFormula = baseValue * baseValue
    val hour = seconds / hourFormula
    val minute = (seconds % hourFormula) / baseValue
    val remainingSeconds = seconds % baseValue

    val result = String.format("%02d:%02d:%02d", hour, minute, remainingSeconds)
    println(result)
}