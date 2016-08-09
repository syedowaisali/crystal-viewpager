package com.crystal.crystalviewpager.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.crystal.crystalviewpager.ui.fragments.Page;

import java.util.List;

/**
 * Created by owais.ali on 7/28/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private final List<Page> pages;

    public PagerAdapter(FragmentManager fm, List<Page> pages) {
        super(fm);
        this.pages = pages;
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }
}
