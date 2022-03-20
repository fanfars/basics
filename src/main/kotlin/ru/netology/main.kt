package ru.netology

fun main() {
    val likes = 121
    if (likes % 10 != 1 || (likes - 11) % 100 == 0) println("Понравилось $likes людям")
    else println("Понравилось $likes человеку")
}