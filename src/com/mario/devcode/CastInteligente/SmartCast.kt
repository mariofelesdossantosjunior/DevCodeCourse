package com.mario.devcode.CastInteligente

/**
 * Created by mario on 17/07/17.
 */
//3 x 4 x 2 + 2 + 4
interface Expressao
class Numero(val valor:Int) : Expressao
class Somar(val valorA: Expressao, val valorB: Expressao): Expressao
class Multiplicar(val valorA: Expressao, val valorB: Expressao): Expressao

fun valorExpressao(expressao: Expressao): Int{
    if(expressao is Numero){
        return expressao.valor
    }else if(expressao is Somar){
        return valorExpressao(expressao.valorA) + valorExpressao(expressao.valorB)
    }else if(expressao is Multiplicar){
        return valorExpressao(expressao.valorA) * valorExpressao(expressao.valorB)
    }else{
        throw IllegalArgumentException("Não posso conhecer essa expressão")
    }
}

fun main(args: Array<String>) {
    println(valorExpressao(Somar(Somar(Multiplicar(Multiplicar(Numero(3),Numero(4)),Numero(2)),Numero(2)),Numero(4))))
}