package geek.com.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myToast("Hello World")

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editTextMessage)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            myToast("Hello User, You typed ${editText.text}")
        }

        textView.text = "Hello Kotlin"

        //replacement of String.format
        myToast("Hello ${textView.text}, how are you ?")

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

    fun onClick(buttonView : View){
        val editText = findViewById<EditText>(R.id.editTextMessage)
        myToast("Hello User, You typed \"${editText.text}\" in the EditText")
    }

}
