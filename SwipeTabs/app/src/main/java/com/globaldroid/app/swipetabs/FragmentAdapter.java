package com.globaldroid.app.swipetabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by User on 1/14/2018.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {
    int TabCount;

    public FragmentAdapter(FragmentManager fragmentManager, int CountTabs) {

        super(fragmentManager);

        this.TabCount = CountTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabOne tab1 = new TabOne();
                return tab1;

            case 1:
                TabTwo tab2 = new TabTwo();
                return tab2;

            case 2:
                TabThree tab3 = new TabThree();
                return tab3;

            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return TabCount;
    }
}
