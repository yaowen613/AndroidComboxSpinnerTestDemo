package com.yaowen.combobox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HelloWorld on 2015/9/30.
 */
public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private List<Person> mList;
    public MyAdapter(Context mContext,List<Person> pList){
        this.mContext=mContext;
        this.mList=pList;
    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        if (convertView==null){
            convertView=layoutInflater.inflate(R.layout.spinner_item_layout,null);
            //TextView personName= (TextView) convertView.findViewById(R.id.personName);
            TextView personAdd= (TextView) convertView.findViewById(R.id.personAdd);
            //personName.setText(mList.get(position).getPersonName());
            personAdd.setText(mList.get(position).getPersonAdd());
        }
        return convertView;
    }
}
