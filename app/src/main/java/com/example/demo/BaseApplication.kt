package com.example.demo

import android.app.Application

/**
 * <pre>
 *     author : wanlinruo
 *     time   : 2020/04/16/1:18
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class BaseApplication : Application() {

    private lateinit var sApplication: Application

    fun getInstance(): Application {
        return sApplication
    }

    override fun onCreate() {
        super.onCreate()
        sApplication = this
    }
}