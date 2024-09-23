package org.example.lesson_2
const val BASE_VALUE = 60

fun main() {
    val departureTime = 9
    val departureMinute = 39
    val travelTime = 457

    val arrivalTime = departureTime * BASE_VALUE + departureMinute + travelTime
    val arrivalHours = arrivalTime / BASE_VALUE
    val arrivalMinute = arrivalTime % BASE_VALUE

    println(String.format("%02d:%02d", arrivalHours, arrivalMinute,))



}