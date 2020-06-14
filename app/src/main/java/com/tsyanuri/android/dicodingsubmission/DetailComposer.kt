package com.tsyanuri.android.dicodingsubmission

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_composer.*

class DetailComposer : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME  = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_composer)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail Composer"
        actionbar.setDisplayHomeAsUpEnabled(true)

        /* Data actually show
        Log.d("trias", intent.getStringExtra(EXTRA_NAME))
        Log.d("sarah", intent.getStringExtra(EXTRA_DETAIL))
        Log.d("yanuri", intent.getStringExtra(EXTRA_PHOTO)*/

        val iName : String? = intent.getStringExtra(EXTRA_NAME)
        val iBio : String? = intent.getStringExtra(EXTRA_DETAIL)
        val iImage : Int?  = intent.getIntExtra(EXTRA_PHOTO, 0)

        Glide.with(this)
            .load(iImage)
            .apply(RequestOptions())
            .into(img_set_photo)
        tv_set_name.text = iName
        tv_set_detail.text = iBio
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

