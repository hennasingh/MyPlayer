package geek.com.myplayer


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = MediaAdapter(getMedia()) {
                mediaItem ->  toast(mediaItem.title)
        }

        val textView = TextView(this).apply2 {
            text = "Hello"
            textSize = 20f
        }

      }

    fun <T> T.apply2(f :T.() -> Unit):T {
        this.f()
        return this
    }

}

