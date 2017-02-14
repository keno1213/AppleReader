package com.appleking.reader.http;

import android.util.Log;

import com.appleking.reader.bean.BookResult;
import com.appleking.reader.bean.ContentResult;
import com.appleking.reader.bean.PageResult;
import com.appleking.reader.bean.ResultBean;
import com.appleking.reader.listener.HttpListener;
import com.google.gson.Gson;
import com.show.api.ShowApiRequest;

/**
 * Created by appleking on 2017/2/14.
 */

public class HttpUtils {
    public static void getArticles(final HttpListener<ResultBean> listener){
        new Thread() {
            //在新线程中发送网络请求
            public void run() {
                String appid = "32071";//要替换成自己的
                String secret = "56b3ecf414fb4f16b5f6e65b4d38b60a";//要替换成自己的
                final String res = new ShowApiRequest("http://route.showapi.com/211-3", appid, secret)
                        .post();
                Gson gson = new Gson();
                ResultBean resultBean = gson.fromJson(res, ResultBean.class);
                System.out.println(resultBean.getShowapi_res_code()+"-----");
                Log.e("Log",res);
                listener.success(resultBean);
            }
        }.start();

    }

    public static void getNovels(final String type, final int page, final String keyword, final HttpListener<BookResult> listener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String appid = "32071";//要替换成自己的
                String secret = "56b3ecf414fb4f16b5f6e65b4d38b60a";//要替换成自己的
                final String res=new ShowApiRequest( "http://route.showapi.com/211-2", appid, secret)
                        .addTextPara("keyword", keyword)
                        .addTextPara("typeId", type)
                        .addTextPara("page", ""+page)
                        .post();
                Gson gson = new Gson();
                BookResult bookResult = gson.fromJson(res, BookResult.class);
                listener.success(bookResult);
                System.out.println(res);
            }
        }).start();

    }
    public static void getPages(final String bookid, final HttpListener<PageResult> listener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String appid = "32071";//要替换成自己的
                String secret = "56b3ecf414fb4f16b5f6e65b4d38b60a";//要替换成自己的
                final String res=new ShowApiRequest( "http://route.showapi.com/211-1", appid, secret)
                        .addTextPara("bookId", bookid)
                        .post();
                Gson gson = new Gson();
                PageResult pageResult = gson.fromJson(res, PageResult.class);
                listener.success(pageResult);
                System.out.println(res);
            }
        }).start();

    }

    public static void getContent(final String bookid, final String cid, final HttpListener<ContentResult> listener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String appid = "32071";//要替换成自己的
                String secret = "56b3ecf414fb4f16b5f6e65b4d38b60a";//要替换成自己的
                final String res=new ShowApiRequest( "http://route.showapi.com/211-4", appid, secret)
                        .addTextPara("bookId", bookid)
                        .addTextPara("cid", cid)
                        .post();
                Gson gson = new Gson();
                ContentResult pageResult = gson.fromJson(res, ContentResult.class);
                listener.success(pageResult);
                System.out.println(res);
            }
        }).start();

    }

}
