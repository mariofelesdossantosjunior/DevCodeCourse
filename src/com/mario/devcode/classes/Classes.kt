package com.mario.devcode.classes

import com.mario.devcode.pessoa.Pessoa

/**
 * Created by mario on 17/07/17.
 */
fun main(args: Array<String>) {
    val pessoa = Pessoa("Mario", 25)
    println(pessoa.nome)
    println(pessoa.idade)

    pessoa.idade = 15
    println(pessoa.idade)
    println(pessoa.ehMaiorDeIdade)
}