package com.mario.devcode.pessoa

/**
 * Created by mario on 17/07/17.
 */

class Pessoa(val nome: String, var idade: Int){
    val ehMaiorDeIdade: Boolean get() = idade >= 18
}