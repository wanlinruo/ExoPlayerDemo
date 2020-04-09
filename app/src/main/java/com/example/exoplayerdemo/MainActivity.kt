package com.example.exoplayerdemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creating the player
        val player = SimpleExoPlayer.Builder(this).build()

        // Bind the player to the view.
        playerView.player = player
//        playerControlView.player = player

        // Produces DataSource instances through which media data is loaded.
        val dataSourceFactory: DataSource.Factory =
            DefaultDataSourceFactory(this, Util.getUserAgent(this, applicationInfo.packageName))
        // This is the MediaSource representing the media to be played.
//        val videoSource: MediaSource =
//            ProgressiveMediaSource.Factory(dataSourceFactory)
//                .createMediaSource(Uri.parse("https://v-cdn.zjol.com.cn/280443.mp4"))
        val videoSource: MediaSource =
            ProgressiveMediaSource.Factory(dataSourceFactory)
                .createMediaSource(Uri.parse("http://vfx.mtime.cn/Video/2019/03/18/mp4/190318231014076505.mp4"))
        // Prepare the player with the source.
        player.prepare(videoSource)
    }
}
