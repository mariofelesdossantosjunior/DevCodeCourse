package com.mario.devcode.`when`

import com.mario.devcode.enums.Moeda

/**
 * Created by mario on 17/07/17.
 */
fun converterMoeda(qtd: Double,moeda: Moeda) = when(moeda){
    Moeda.PEN -> qtd * 3.4
    Moeda.USD -> qtd
    Moeda.ARS -> qtd * 4.7
    Moeda.MXN -> qtd * 5.97
    Moeda.BOB -> qtd * 2.04
    Moeda.CLP -> qtd * 192.21
    Moeda.PYG -> qtd * 1712.20
    Moeda.UYU -> qtd * 8.4
}

fun obtendoRegiaoMoeda(moeda: Moeda) = when(moeda){
    Moeda.PEN, Moeda.USD -> "Norte Americana"
    Moeda.ARS, Moeda.MXN,
    Moeda.BOB,
    Moeda.CLP,
    Moeda.PYG,
    Moeda.UYU -> "Sul da America"
}

fun main(args: Array<String>) {
    println(converterMoeda(10.0,Moeda.UYU))
    println(obtendoRegiaoMoeda(Moeda.UYU))
    println(obtendoRegiaoMoeda(Moeda.USD))
}