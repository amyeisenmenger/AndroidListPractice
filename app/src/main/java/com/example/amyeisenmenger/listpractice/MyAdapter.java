package com.example.amyeisenmenger.listpractice;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by AmyEisenmenger on 3/28/16.
 */
public class MyAdapter extends ArrayAdapter<String>{
    public MyAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout_2, values);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());
        View theView = theInflater.inflate(R.layout.row_layout_2, parent, false);

        String tvShow = getItem(position);

        TextView theTextView = (TextView) theView.findViewById(R.id.textView1);
        theTextView.setText(tvShow);
        ImageView theImageView = (ImageView) theView.findViewById(R.id.imagedot);
        theImageView.setImageResource(R.drawable.dot);
        return theView;
    }
}
