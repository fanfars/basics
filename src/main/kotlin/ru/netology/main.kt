package ru.netology

fun main() {
    val lastExpenses = 10_000
    val buy = 1000.0
    val isRegular = true
    val discount = 100.0
    val discountOrdinary = 5.0
    val discountRegular = 1.0
    var amount = 0.0
    if (lastExpenses <= 1_000) {
        amount = buy
        println(
            "Нет скидки за предыдущие покупки"
        )
    } else if (lastExpenses in 1001..10_000) {
        if ((buy - discount) > 0) {
            amount = buy - discount
            println("После скидки $discount р. за предыдушие покупки - $amount руб.")
        } else {
            amount = buy
            println(
                "Скидка за предыдущие покупки не может быть больше суммы покупки"
            )
        }
    } else if (lastExpenses > 10_000) {
        amount = buy - buy * discountOrdinary / 100.0
        println("После скидки $discountOrdinary % за предыдущие покупки - $amount руб.")
    }
    if (isRegular) {
        amount -= (amount * discountRegular / 100.0)
        println("После скидки постоянного покупателя в $discountRegular % - $amount руб")
    } else {
        println("Нет скидки постоянного клиента")
    }
    val rub = amount.toInt()
    val kop = ((amount * 100.0).toInt()) % (rub * 100)
    if (kop != 0) println("Сумма покупки $rub руб $kop коп") else println("Сумма покупки $rub руб")
}