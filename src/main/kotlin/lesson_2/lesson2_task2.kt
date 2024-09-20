package org.example.lesson_2

fun main() {
    val numberOfEmployees = 50
    val salary = 30000
    val numberOfTrainees = 30
    val salaryOfTrainees = 20000
    val payrollFund = numberOfEmployees * salary
    val generalWageFund = payrollFund + (numberOfTrainees * salaryOfTrainees)
    val averageSalary = generalWageFund / (numberOfEmployees + numberOfTrainees)

    println("Количество штатных сотрудников - $numberOfEmployees")
    println("Заработная плата штатных сотрудников - $salary")
    println("Количество стажеров - $numberOfTrainees")
    println("Заработная плата стажеров - $salaryOfTrainees")
    println("Фонд заработной платы штатных сотрудников - $payrollFund")
    println("Общий ФОТ - $generalWageFund")
    println("Средняя ЗП по всей компании $averageSalary")

}