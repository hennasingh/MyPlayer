package geek.com.myplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val v: View

        //Java Code
        v.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                toast("View Clicked")
            }
        })

        //Kotlin Code
        v.setOnClickListener{
            toast("View Clicked")
        }
    }

    private fun toast(message: String): Unit {
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }


}

