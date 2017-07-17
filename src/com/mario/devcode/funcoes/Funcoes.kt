package com.mario.devcode.funcoes

/**
 * Created by mario on 17/07/17.
 */
fun main(args: Array<String>) {
    println("Inicio do Curso")

    println(somar(2, 4))

    println(ehMaiorDeIdade(20))

    println(ehMaiorDeIdade(15))
}


fun somar(x: Int, y: Int) = x + y

fun ehMaiorDeIdade(idade: Int) = idade >= 18