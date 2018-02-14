package com.example.myapplication;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        TabFragment1 fragment = TabFragment1.newInstance();
        switch (position) {
            case 0:
                fragment.loadData(DummyData.getData0());
                break;
            case 1:
                fragment.loadData(DummyData.getData1());
                break;
            case 2:
                fragment.loadData(DummyData.getData2());
                break;
            default:
                return null;
        }

        return  fragment;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }


}