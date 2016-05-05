package com.wt.coolweather.util;

/**
 * Created by Administrator on 2016/5/5 0005.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
