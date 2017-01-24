package com.example.dell.flyinbuds;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.square;
/**
 * Created by Dell on 1/11/2017.
 */

public class PagerCustomAdapter extends PagerAdapter {

    private int numberOfView;
    private Picasso p;
    private int[] imageList= {R.drawable.ad1,R.drawable.ad1};

    private Context mContext;
    LayoutInflater mLayoutInflater;

    PagerCustomAdapter(Context context)
    {
        this.numberOfView=numberOfView;
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return imageList.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
            View v = mLayoutInflater.inflate(R.layout.pager_item,container,false);
        ImageView imageView=(ImageView)v.findViewById(R.id.imageView);
        //.placeholder(R.id.imageView)
       // Picasso.with(mContext).load("http://10.0.2.2/flyinbuds/far.jpg").resize(640,640).into(imageView);
        imageView.setImageResource(imageList[position]);
        container.addView(v);

        return v;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
