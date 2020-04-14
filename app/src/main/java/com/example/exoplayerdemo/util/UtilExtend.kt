package com.example.exoplayerdemo.util

import android.app.Activity
import android.content.Intent

/**
 * <pre>
 *     author : wanlinruo
 *     time   : 2020/04/11/17:49
 *     desc   :
 *     version: 1.0
 * </pre>
 */

fun Activity.jumpActivity(cls: Class<out Activity>) {
    val intent = Intent()
    intent.setClass(this, cls)
    startActivity(intent)
}