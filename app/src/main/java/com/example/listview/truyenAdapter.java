package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class truyenAdapter extends BaseAdapter {

    Context mycontext;
    int myLayout;
    List<truyen> arrTruyen;
    public truyenAdapter(Context context,int layout,List<truyen> truyenList){
        mycontext=context;
        myLayout=layout;
        arrTruyen=truyenList;
    }

    public int getCount() {
        return arrTruyen.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);
        TextView txtTen = (TextView) convertView.findViewById(R.id.txtten);
        txtTen.setText(arrTruyen.get(position).ten);
        ImageView imgL = (ImageView) convertView.findViewById(R.id.hinhtrai);
        imgL.setImageResource(arrTruyen.get(position).hinhleft);
        ImageView imgR = (ImageView) convertView.findViewById(R.id.hinhphai);
        imgR.setImageResource(arrTruyen.get(position).hinhright);
        return convertView;
    }
}
