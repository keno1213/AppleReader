package com.appleking.reader.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.appleking.reader.R;
import com.appleking.reader.bean.BookResult;

import java.util.List;

/**
 * Created by appleking on 2017/2/14.
 */

public class BookAdapter extends BaseAdapter {
    private List<BookResult.ShowapiResBodyBean.PagebeanBean.ContentlistBean> mDatas;

    private Context context;

    public BookAdapter(List<BookResult.ShowapiResBodyBean.PagebeanBean.ContentlistBean> mDatas, Context context) {
        this.mDatas = mDatas;
        this.context = context;
    }

    public List<BookResult.ShowapiResBodyBean.PagebeanBean.ContentlistBean> getmDatas() {
        return mDatas;
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
        ViewHolder holder;
        if(convertView == null){
            convertView = View.inflate(context, R.layout.item_book,null);
            holder = new ViewHolder();
            holder.tv_name = (TextView) convertView.findViewById(R.id.book_name);
            holder.author = (TextView) convertView.findViewById(R.id.tv_author_name);
            holder.newPage = (TextView) convertView.findViewById(R.id.new_page);
            holder.tv_time = (TextView) convertView.findViewById(R.id.update_time);
        convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        BookResult.ShowapiResBodyBean.PagebeanBean.ContentlistBean contentlistBean = mDatas.get(position);


        holder.tv_name.setText(contentlistBean.getName());
        holder.author.setText("作者："+contentlistBean.getAuthor());
        holder.newPage.setText("最新章节"+contentlistBean.getNewChapter());
        holder.tv_time.setText("最近更新："+contentlistBean.getUpdateTime());
        return convertView;
    }

    class ViewHolder{
        TextView tv_name;
        TextView author;
        TextView newPage;
        TextView tv_time;

    }
}
