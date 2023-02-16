package com.seliimyilmaaz.kotlincoroutine

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        delay(2000)
        println("Run Blocking")
        myFunc()
    }
}

suspend fun myFunc(){                           //For coroutineScope working inside the method. We should call suspend.
    coroutineScope {
        launch {
            delay(4000)
            println("Coroutine Scope")
        }
    }
}