package geek.com.myplayer

import android.view.View
import android.view.ViewGroup
import android.widget.TextView

data class MediaItem(val title: String, val thumbUrl: String, val type: Type){
    enum class Type { PHOTO, VIDEO}
}

fun test(type: MediaItem.Type) {
    when(type) {
        MediaItem.Type.PHOTO -> print("photo")
        MediaItem.Type.VIDEO -> print("video")
    }

}

fun test1(view: View){
    when(view){
        is TextView -> view.text = "Hello"
        is ViewGroup -> view.childCount
    }
}


fun test3(view: View){
    val stringType = when(view){
        is TextView -> "textView"
        is ViewGroup -> "viewGroup"
        else -> "unknown"
    }

    val myInt = if(view is TextView) 20 else 0
}