package com.mario.devcode.iteracoes


/**
 * Created by mario on 18/07/17.
 */
fun main(args: Array<String>) {
    val array = arrayListOf("A", "B", "C", "D", "E")

    for ((index,c) in array.withIndex()){
        println("$index $c")
    }
}