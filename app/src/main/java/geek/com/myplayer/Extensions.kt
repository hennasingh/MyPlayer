package geek.com.myplayer

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.widget.Toast

fun Context.toast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun RecyclerView.ViewHolder.toast(message:String){
    itemView.context.toast(message)
}