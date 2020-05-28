package sondo65.com.lazada.views

import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import sondo65.com.lazada.ImageLoader
import sondo65.com.lazada.R
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var imageLoader: ImageLoader;

    @Inject
    lateinit var str : String;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
