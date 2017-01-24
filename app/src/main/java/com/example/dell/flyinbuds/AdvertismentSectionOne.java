package com.example.dell.flyinbuds;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Dell on 1/11/2017.
 */

public class AdvertismentSectionOne extends Fragment
{
    private ViewPager viewPager;
    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.advertisementholdersection1,container,false);
        viewPager=(ViewPager)v.findViewById(R.id.viewPagerAddSec1);
        viewPager.setAdapter(new PagerCustomAdapter(getContext()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        return v;
    }
}
