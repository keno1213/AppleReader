package com.appleking.reader;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.appleking.reader.adapter.PageAdapter;
import com.appleking.reader.bean.PageResult;
import com.appleking.reader.http.HttpUtils;
import com.appleking.reader.listener.HttpListener;

/**
 * Created by appleking on 2017/2/14.
 */

public class PageActivity extends AppCompatActivity {
    private int page =1 ;
    private TextView content;
    private ListView lv;
    private PageAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_layout);
        lv = (ListView) findViewById(R.id.page_list);
        content = (TextView) findViewById(R.id.tv_content);
        String bookid = getIntent().getStringExtra("bookid");
        HttpUtils.getPages(bookid, new HttpListener<PageResult>() {
            @Override
            public void success(final PageResult bean) {
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        adapter = new PageAdapter(bean.getShowapi_res_body().getBook().getChapterList(),PageActivity.this);
                        lv.setAdapter(adapter);
                    }
                });
            }

            @Override
            public void fail() {

            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PageActivity.this,ContentActivity.class);
                intent.putExtra("cid",adapter.getmDatas().get(position).getCid());
                intent.putExtra("bookid",adapter.getmDatas().get(position).getBookId());
                startActivity(intent);
            }
        });
    }
}
