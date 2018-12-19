package geek.com.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myToast("Hello World")
    }

    private fun myToast(text: String) { // after : is return value
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
    }
}
