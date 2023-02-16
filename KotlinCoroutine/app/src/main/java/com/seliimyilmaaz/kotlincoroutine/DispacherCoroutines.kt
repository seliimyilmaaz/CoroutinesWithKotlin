package com.seliimyilmaaz.kotlincoroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){


    //Dispacher
    //Dispatcher.IO -> Input output while taking data from web
    //Dispatcher.Main -> Main Dispatcher
    //Dispatcher.Default -> CPU Intensive
    //Dispatcher.Unconfined -> Inherited dispatcher


    runBlocking {
        launch(Dispatchers.Main){
            println("Main Thread :  ${Thread.currentThread().name}")
        }

        launch(Dispatchers.IO){
            println("IO Thread :  ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Default){
            println("Default Thread :  ${Thread.currentThread().name}")
        }

        launch(Dispatchers.Unconfined){
            println("Unconfined Thread :  ${Thread.currentThread().name}")
        }
    }
}