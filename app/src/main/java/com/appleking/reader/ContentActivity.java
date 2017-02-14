package com.appleking.reader;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.appleking.reader.bean.ContentResult;
import com.appleking.reader.http.HttpUtils;
import com.appleking.reader.listener.HttpListener;

/**
 * Created by appleking on 2017/2/14.
 */

public class ContentActivity extends AppCompatActivity {

    private TextView tv_content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_layout);
        tv_content = (TextView) findViewById(R.id.tv_content);
        String bookid = getIntent().getStringExtra("bookid");
        String cid = getIntent().getStringExtra("cid");
        HttpUtils.getContent(bookid, cid, new HttpListener<ContentResult>() {
            @Override
            public void success(final ContentResult bean) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv_content.setText(bean.getShowapi_res_body().getTxt().replace("<br/>","\n").replace("<br />","\n"));
                    }
                });
            }

            @Override
            public void fail() {

            }
        });
    }
}
