package geek.com.myplayer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.view_media_item.view.*
import okhttp3.MediaType
import java.util.zip.Inflater

class MediaAdapter(private val items: List<MediaItem>, val listener: (MediaItem) -> Unit)
    : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {


    override fun onCreateViewHolder(container: ViewGroup, viewType: Int): MediaViewHolder {
        //val view = LayoutInflater.from(container.context).inflate(R.layout.view_media_item, container, false)
        val view = container.inflate(R.layout.view_media_item)
        return MediaViewHolder(view)
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(mediaHolder: MediaViewHolder, position: Int) {

        mediaHolder.bind(items[position])
        mediaHolder.itemView.setOnClickListener {
            listener(items[position])
        }

    }

    class MediaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        fun bind(item: MediaItem) = with(itemView) {
            media_title.text = item.title
            media_thumb.loadUrl(item.thumbUrl)
            media_video_indicator.visibility = when (item.type) {
                MediaItem.Type.PHOTO -> View.GONE
                MediaItem.Type.VIDEO -> View.VISIBLE
            }
         }
     }

}

