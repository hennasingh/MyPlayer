package geek.com.myplayer

data class MediaItem(val title: String, val thumbUrl: String, val type: TYPE){
    enum class TYPE { PHOTO, VIDEO}
}