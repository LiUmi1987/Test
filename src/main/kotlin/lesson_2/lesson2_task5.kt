package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val term = 20
    val interestRate = 0.167
    // A=P(1+r/n) в степени nt

    val finalAmount = deposit * (1+interestRate).pow(term)
    println("%.3f".format(finalAmount))
}