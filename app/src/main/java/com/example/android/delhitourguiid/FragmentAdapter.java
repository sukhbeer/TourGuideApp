package com.example.android.delhitourguiid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SightsFragment();
        } else if(position==1){
            return new Market();
        }else if(position==2){
            return new Hotel();
        }else{
            return new Food();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return context.getString(R.string.places);
        } else if(position==1){
            return context.getString(R.string.market);
        }else if(position==2){
            return context.getString(R.string.hotel);
        }else{
            return context.getString(R.string.food);
        }
    }
}
