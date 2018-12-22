package geek.com.myplayer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.view_media_item.view.*
import java.util.zip.Inflater

class MediaAdapter(private val items: List<MediaItem>) : RecyclerView.Adapter<MediaAdapter.MediaViewHolder>() {

    override fun onCreateViewHolder(container: ViewGroup, viewType: Int): MediaViewHolder {
        //val view = LayoutInflater.from(container.context).inflate(R.layout.view_media_item, container, false)
        val view = container.inflate(R.layout.view_media_item)
        return MediaViewHolder(view)
    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(mediaHolder: MediaViewHolder, position: Int) {

        mediaHolder.bind(items[position])
    }

    class MediaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val title = itemView.find<TextView>(R.id.titleView)
        val image = itemView.find<ImageView>(R.id.thumbUrlView)

        fun bind(item: MediaItem){
            title.text = item.title
            image.loadUrl(item.thumbUrl)
        }
    }
}

