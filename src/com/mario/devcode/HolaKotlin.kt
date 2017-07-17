package com.mario.devcode

import java.util.*

/**
 * Created by mario on 17/07/17.
 */
fun main(args: Array<String>) {
    println("Escreva seu nome ou aperte [Enter] para seguir como anónimo:")

    val scanner = Scanner(System.`in`)
    val nextLine = scanner.nextLine()
    val name = if (!nextLine.isEmpty()) nextLine else "Kotlin"

    println("Hola $name")
}