package geek.com.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myToast("Hello World")

      }

    private fun myToast(text: String) { // after : is return value
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }

    fun getInt(int: Int) : Int = 2*int

    fun test() {
        val x:Int = 20
        val y:Long = x.toLong()
        var string = "hello"
        string = "GoodBye"
    }

}
