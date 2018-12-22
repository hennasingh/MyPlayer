package geek.com.myplayer

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

fun Context.toast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun RecyclerView.ViewHolder.toast(message:String)= itemView.context.toast(message)

fun ViewGroup.inflate(layoutRes: Int) = LayoutInflater.from(context).inflate(layoutRes,this,false)

fun ImageView.loadUrl(url: String) = Picasso.get().load(url).into(this)