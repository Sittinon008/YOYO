package com.example.natchaya006.psupin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by STD on 7/11/2560.
 */

public class PinAdapter extends BaseAdapter {

    Context context;
    ArrayList<PinObject> pinObject = new ArrayList<>();

    public PinAdapter(Context context, ArrayList<PinObject> pinObject) {
        this.context = context;
        this.pinObject = pinObject;
    }

    @Override
    public int getCount() {
        return this.pinObject.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater mInflater =
                (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.listtest, viewGroup, false);

        TextView name = (TextView)view.findViewById(R.id.name);
        name.setText(this.pinObject.get(i).getName());

        TextView time = (TextView)view.findViewById(R.id.time);
        time.setText(this.pinObject.get(i).getTime());

        TextView title = (TextView)view.findViewById(R.id.title);
        title.setText(this.pinObject.get(i).getTitle());

        TextView textViewDesc = (TextView)view.findViewById(R.id.desc);
        textViewDesc.setText(this.pinObject.get(i).getDesc());



        ImageView icon = (ImageView)view.findViewById(R.id.icon);
        int num = this.pinObject.get(i).getIcon();
        if (num==1){
            icon.setBackgroundResource(R.drawable.ic_sentiment_dissatisfied_black_24dp);
        }
        else if(num==2){ icon.setBackgroundResource(R.drawable.ic_sentiment_neutral_black_24dp);}
        else if(num==3){ icon.setBackgroundResource(R.drawable.ic_sentiment_satisfied_black_24dp);}
        else{ icon.setBackgroundResource(R.drawable.ic_sentiment_neutral_black_24dp);}

        return view;
    }
}
