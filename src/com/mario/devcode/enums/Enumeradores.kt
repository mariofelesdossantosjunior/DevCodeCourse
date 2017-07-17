package com.mario.devcode.enums

/**
 * Created by mario on 17/07/17.
 */
enum class Moeda(val simbolo: String){
    PEN("S/."),
    USD("$"),
    ARS("$"),
    MXN("$"),
    BOB("\$b"),
    CLP("$"),
    PYG("Gs"),
    UYU("\$U");

    fun formato(qtd: Double) = "$simbolo $qtd"
}

fun main(args: Array<String>) {
    println(Moeda.ARS)
    println(Moeda.PYG.simbolo)
    println(Moeda.USD.formato(10.00))
}