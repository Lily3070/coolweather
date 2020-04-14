package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author xiaoxin       2020/4/12
 * @version $Rev$
 * @des ${发起一条HTTP请求只需要调用此方法，传入请求地址，并注册一个回调来处理服务器响应就可以了}
 * @updateAuthor $Author$
 * @updateDes ${T000}
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();

        client.newCall(request).enqueue(callback);
    }
}
