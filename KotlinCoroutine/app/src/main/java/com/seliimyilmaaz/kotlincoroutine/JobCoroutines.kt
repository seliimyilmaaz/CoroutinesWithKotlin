package com.seliimyilmaaz.kotlincoroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){

    runBlocking {

        val myJob = launch {
            delay(2000)
            println("job")
            val myJob2 = launch {
                println("myJob2")
            }
        }

        myJob.invokeOnCompletion {
            launch {
                println("Run this block after myJob is finished")
            }
        }
    }

}