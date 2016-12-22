package com.erif.adminpegawai.home;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ERIF on 16/12/2016.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int numTabs;

    public PagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentGaji fragment1=new FragmentGaji();
                return fragment1;
            case 1:
                FragmentKaryawan fragmentKaryawan =new FragmentKaryawan();
                return fragmentKaryawan;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
