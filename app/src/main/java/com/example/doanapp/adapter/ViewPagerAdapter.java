package com.example.doanapp.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.doanapp.Fragment.Fragment1;
import com.example.doanapp.Fragment.Fragment2;
import com.example.doanapp.Fragment.Fragment3;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  new Fragment1();
            case 1:
                return  new Fragment2();
            case 2:
                return  new Fragment3();

            default:
                return new Fragment1();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

}