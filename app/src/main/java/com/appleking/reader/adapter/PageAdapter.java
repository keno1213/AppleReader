package com.appleking.reader.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.appleking.reader.R;
import com.appleking.reader.bean.PageResult;

import java.util.List;

/**
 * Created by appleking on 2017/2/14.
 */

public class PageAdapter extends BaseAdapter {
    private List<PageResult.ShowapiResBodyBean.BookBean.ChapterListBean> mDatas;
    private Context context;

    public List<PageResult.ShowapiResBodyBean.BookBean.ChapterListBean> getmDatas() {
        return mDatas;
    }

    public PageAdapter(List<PageResult.ShowapiResBodyBean.BookBean.ChapterListBean> mDatas, Context context) {
        this.mDatas = mDatas;
        this.context = context;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = View.inflate(context, R.layout.item_pages,null);
        }
        TextView tv_page = (TextView) convertView.findViewById(R.id.tv_pages);
        tv_page.setText(mDatas.get(position).getName());
        return convertView;
    }
}
