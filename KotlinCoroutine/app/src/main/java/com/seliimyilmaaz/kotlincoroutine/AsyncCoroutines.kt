package com.seliimyilmaaz.kotlincoroutine

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {

        val downloadedName = async {      //Async and launch working similar but async waits return value
            downloadName()                // and you can get the value with await
        }

        val downloadedAge = async {
            downloadAge()
        }

        val userName = downloadedName.await()
        val userAge = downloadedAge.await()

        println("${userName} ${userAge}")
    }

}

suspend fun downloadName():String{
    delay(4000)
    println("User Name Download")
    val userName = "Selim"
    return userName
}

suspend fun downloadAge():Int{
    delay(2000)
    println("User Age Download")
    val userAge = 24
    return userAge
}