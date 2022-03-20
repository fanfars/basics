package ru.netology

fun main() {
    val amount: Int = 10_000
    val feePercent = 0.75
    val minFee = 3_500
    val commission = (amount * feePercent).toInt()
    val fee = if (commission > minFee) commission else minFee
    println("Комиссия $fee коп.")
}
