package com.seliimyilmaaz.kotlincoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //run blocking
     /*   println("run blocking start")
        runBlocking {
            launch {
                delay(5000)                 //Inside of the run blocking everything stop until block runs
                println("run blocking")             //So outside of the runblockinng end would be deploy 5 sn later
            }
        }
        println("run blocking end")*/

      /*  println("global scope start")                //Global scope end would be deploy before launch block because
        GlobalScope.launch {                         //Global scope doesn't effect way of working outside of the block
            delay(3000)
            println("global scope")
        }
        println("global scope end")*/

      /*  println("coroutine scope start")
        CoroutineScope(Dispatchers.Default).launch {
            delay(3000)
            println("coroutine scope")
        }
        println("coroutine scope end")*/

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


}