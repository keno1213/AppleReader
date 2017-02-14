package com.appleking.reader;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.appleking.reader.adapter.BookAdapter;
import com.appleking.reader.bean.BookResult;
import com.appleking.reader.http.HttpUtils;
import com.appleking.reader.listener.HttpListener;

/**
 * Created by appleking on 2017/2/14.
 */

public class BookActivity extends AppCompatActivity {

    private ListView lv;
private int page = 1;
    private BookAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.novel_layout);
        lv = (ListView) findViewById(R.id.novel_list);
        String id = getIntent().getStringExtra("id");
        HttpUtils.getNovels(id, page, "", new HttpListener<BookResult>() {
            @Override
            public void success(final BookResult bean) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter = new BookAdapter(bean.getShowapi_res_body().getPagebean().getContentlist(),BookActivity.this);
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
                Intent intent = new Intent(BookActivity.this,PageActivity.class);
                intent.putExtra("bookid",adapter.getmDatas().get(position).getId());
                startActivity(intent);
            }
        });
    }
}
