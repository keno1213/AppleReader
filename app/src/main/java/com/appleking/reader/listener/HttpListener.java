package com.appleking.reader.listener;

import com.appleking.reader.bean.ResultBean;

/**
 * Created by appleking on 2017/2/14.
 */

public interface HttpListener<T> {
    void success(T bean);
    void fail();
}
