package com.example.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exoplayer.demo.video.ListingActivity
import com.example.exoplayer.demo.video.SingleActivity
import com.example.exoplayer.demo.oss.DownloadActivity
import com.example.exoplayer.demo.oss.UploadActivity
import com.example.demo.util.jumpActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initListener()
    }

    private fun initListener() {
        tv_single.setOnClickListener { jumpActivity(SingleActivity::class.java) }
        tv_list.setOnClickListener { jumpActivity(ListingActivity::class.java) }
        tv_upload.setOnClickListener { jumpActivity(UploadActivity::class.java) }
        tv_download.setOnClickListener { jumpActivity(DownloadActivity::class.java) }
    }
}
