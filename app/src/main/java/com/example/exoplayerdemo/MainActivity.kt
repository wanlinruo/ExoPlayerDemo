package com.example.exoplayerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exoplayer.demo.ListingActivity
import com.example.exoplayer.demo.SingleActivity
import com.example.exoplayer.demo.DownloadActivity
import com.example.exoplayer.demo.UploadActivity
import com.example.exoplayerdemo.util.jumpActivity
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
