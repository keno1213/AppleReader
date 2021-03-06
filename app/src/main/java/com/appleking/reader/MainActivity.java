package com.appleking.reader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.appleking.reader.adapter.ArticleAdapter;
import com.appleking.reader.bean.BookResult;
import com.appleking.reader.bean.ResultBean;
import com.appleking.reader.http.HttpUtils;
import com.appleking.reader.listener.HttpListener;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private ArticleAdapter adapter;
    private int page = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.mLsit_view);

         HttpUtils.getArticles(new HttpListener<ResultBean>() {
            @Override
            public void success(final ResultBean bean) {
                Log.e("Log",bean.getShowapi_res_code()+"-----");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        adapter = new ArticleAdapter(bean.getShowapi_res_body().getTypeList(),MainActivity.this);
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
                Intent intent = new Intent(MainActivity.this,BookActivity.class);
                Bundle bundle = new Bundle();
                intent.putExtra("id",adapter.getDatas().get(position).getId());
                startActivity(intent);

            }
        });
    }
}
