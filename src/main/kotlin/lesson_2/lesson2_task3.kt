package org.example.lesson_2

fun main() {
    val departureTime = 9
    val departureMinute = 39
    val travelTime = 457
    val arrivalTime = departureTime * 60 + departureMinute + travelTime
    val arrivalHours = arrivalTime / 60
    val arrivalMinute = arrivalTime % 60

    println(String.format("%02d:%02d", arrivalHours, arrivalMinute,))



}