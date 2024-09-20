package org.example.lesson_1

fun main() {
    val seconds = 6480
    val hour = seconds / 3600
    val minute = (seconds % 3600) / 60
    val remainingSeconds = seconds % 60

    val result = String.format("%02d:%02d:%02d", hour, minute, remainingSeconds)

    println(result)
}