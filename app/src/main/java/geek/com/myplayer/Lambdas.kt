package geek.com.myplayer

import android.telecom.Call


interface Callback {
    fun onCallback(result: String)
}

fun doAsync(x:Int, callback: Callback){
    //Background
    callback.onCallback("Finished")
}

fun testing() {

    //without Lambdas
    doAsync(20, object :Callback {
        override fun onCallback(result: String) {
            print(result)
        }
    })

}

fun lambdas() {

    val f: (Int, Int) -> Int = { x, y -> x + y} //can be defined in varies ways

    val sum = {a: Int, b: Int -> a + b } //compiler infers the types automatically
    applyOp(2,3,sum)

    val mul = {a: Int, b: Int -> a * b }
    applyOp(2,3, mul)

    applyOp(2,3) {x,y -> x -y}

}

fun applyOp(x: Int, y: Int, f: (Int, Int) -> Int) = f(x, y)


