package com.example.android.chaloudaipur;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VenuesFragment();
        } else if (position == 1) {
            return new DiningFragment();
        } else if (position == 2) {
            return new ShoppingFragment();
        } else {
            return new EventFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Venues";
        } else if (position == 1) {
            return "Dining";
        } else if (position == 2) {
            return "Shop";
        } else {
            return "Events";
        }
    }
}
