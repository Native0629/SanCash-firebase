package com.business.sancash;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.business.sancash.Fragments.ChatFragment;
import com.business.sancash.Fragments.HomeFragment;
import com.business.sancash.Fragments.JoinFragment;
import com.business.sancash.Fragments.ProfileFragment;
import com.business.sancash.Fragments.SearchFragment;

public class HomeAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public HomeAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeFragment tab1 = new HomeFragment();
                return tab1;
            case 1:
                JoinFragment tab2 = new JoinFragment();
                return tab2;

            case 2:
                SearchFragment tab3 = new SearchFragment();
                return tab3;

            case 3:
                ChatFragment tab4 = new ChatFragment();
                return tab4;

            case 4:
                ProfileFragment tab5 = new ProfileFragment();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}