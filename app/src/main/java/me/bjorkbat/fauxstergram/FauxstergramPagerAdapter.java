package me.bjorkbat.fauxstergram;

import android.support.v13.app.FragmentPagerAdapter;
import android.app.Fragment;
import android.app.FragmentManager;

/**
 * Created by johnborden on 3/17/17.
 */

public class FauxstergramPagerAdapter extends FragmentPagerAdapter {

    public FauxstergramPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                return new FeedFragment();
            case 1:
                return new UploadFragment();
            case 2:
                return new LogoutFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return "Feed";
            case 1:
                return "Upload";
            case 2:
                return "Logout";
        }

        return null;
    }
}
