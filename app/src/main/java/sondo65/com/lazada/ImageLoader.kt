package sondo65.com.lazada

import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageLoader {
    fun load( url: String, iv : ImageView){
        Picasso.get().load(url).into(iv);
    }
}