package com.appleking.reader.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.appleking.reader.R;
import com.appleking.reader.bean.ResultBean;

import java.util.List;

/**
 * Created by appleking on 2017/2/14.
 */

public class ArticleAdapter extends BaseAdapter {
    private   List<ResultBean.ShowapiResBodyBean.TypeListBean> mDatas;
private Context context;
public List<ResultBean.ShowapiResBodyBean.TypeListBean> getDatas(){
    return mDatas;
}
    public ArticleAdapter(List<ResultBean.ShowapiResBodyBean.TypeListBean> mDatas, Context context) {
        this.mDatas = mDatas;
        this.context = context;
    }

    public ArticleAdapter(List<ResultBean.ShowapiResBodyBean.TypeListBean> mDatas) {
        this.mDatas = mDatas;
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
            convertView = View.inflate(context, R.layout.item_article,null);
        }
        TextView name = (TextView) convertView.findViewById(R.id.tv_name);
        name.setText(mDatas.get(position).getName());
        return convertView;
    }
}
