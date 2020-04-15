package com.example.exoplayer.demo.oss

import android.content.Context
import com.alibaba.sdk.android.oss.ClientConfiguration
import com.alibaba.sdk.android.oss.OSSClient
import com.alibaba.sdk.android.oss.common.OSSLog

/**
 * <pre>
 *     author : wanlinruo
 *     time   : 2020/04/16/0:36
 *     desc   :
 *     version: 1.0
 * </pre>
 */
object OssManager {

    private var sOss: OSSClient? = null

    fun initOss(context: Context) {
        val provider = MyOSSFederationCredentialProvider()
        val conf = ClientConfiguration()
        conf.connectionTimeout = 15 * 1000 // 连接超时，默认15秒
        conf.socketTimeout = 15 * 1000 // socket超时，默认15秒
        conf.maxConcurrentRequest = 5 // 最大并发请求书，默认5个
        conf.maxErrorRetry = 2 // 失败后最大重试次数，默认2次
        sOss = OSSClient(context, Config.OSS_ENDPOINT, provider, conf)
        OSSLog.enableLog()
    }


}