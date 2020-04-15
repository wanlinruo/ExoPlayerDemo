package com.example.exoplayer.demo.oss

import com.alibaba.sdk.android.oss.common.OSSConstants
import com.alibaba.sdk.android.oss.common.auth.OSSFederationCredentialProvider
import com.alibaba.sdk.android.oss.common.auth.OSSFederationToken
import com.alibaba.sdk.android.oss.common.utils.IOUtils
import org.json.JSONObject
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL


/**
 * <pre>
 *     author : wanlinruo
 *     time   : 2020/04/16/0:53
 *     desc   :
 *     version: 1.0
 * </pre>
 */
class MyOSSFederationCredentialProvider : OSSFederationCredentialProvider() {

    override fun getFederationToken(): OSSFederationToken? {
        try {
            val stsUrl = URL("http://localhost:8080/distribute-token.json")
            val conn: HttpURLConnection = stsUrl.openConnection() as HttpURLConnection
            val input: InputStream = conn.inputStream
            val jsonText: String =
                IOUtils.readStreamAsString(input, OSSConstants.DEFAULT_CHARSET_NAME)
            val jsonObject = JSONObject(jsonText)
            val ak = jsonObject.getString("AccessKeyId")
            val sk = jsonObject.getString("AccessKeySecret")
            val token = jsonObject.getString("SecurityToken")
            val expiration = jsonObject.getString("Expiration")
            return OSSFederationToken(ak, sk, token, expiration)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}