package com.xp.mymvp.Activity.Base;

/**
 * Created by jack on 2017/6/20
 */

public interface BaseRequestContract<T> {

    void onRequestSuccessData(T data);

    void getArticleDataFailure(Throwable t);

}