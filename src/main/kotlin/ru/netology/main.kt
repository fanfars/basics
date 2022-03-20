package ru.netology

fun main() {
    val lastExpenses = 1_000
    val buy = 100.0
    val isRegular = false
    val discount = 100.0
    val discountOrdinary = 5.0
    val discountRegular = 1.0
    var amount = 0.0
    if (lastExpenses <= 1_000) {
        amount = if (isRegular) buy - (buy * discountRegular / 100.0) else buy
        if (isRegular) println("После скидки постоянного клиента в $discountRegular % - $amount руб") else println("Нет скидки постоянного клиента")
    } else if (lastExpenses in 1001..10_000) {
        amount = if ((buy - discount) > 0) buy - discount else buy
        if ((buy - discount) > 0) println("После скидки $discount р. за предыдушие покупки - $amount руб.") else println("Скидка за предыдущие покупки не может быть больше суммы покупки")
        amount = if (isRegular) amount - (amount * discountRegular / 100.0) else amount
        if (isRegular) println("После скидки постоянного покупателя в $discountRegular % - $amount руб") else println("Нет скидки постоянного клиента")
    } else if (lastExpenses > 10_000) {
        amount = buy - buy * discountOrdinary / 100.0
        println("После скидки $discountOrdinary % за предыдущие покупки - $amount руб.")
        amount = if (isRegular) amount - (amount * discountRegular / 100.0) else amount
        if (isRegular) println("После скидки постоянного покупателя в $discountRegular % - $amount руб") else println("Нет скидки постоянного клиента")
    }
    val amountFormat = amount.toString().split(".")
    val rub = amountFormat[0]
    val kop = amountFormat[1]
    if (kop != "0") println("Сумма покупки $rub руб $kop коп") else println("Сумма покупки $rub руб")
}