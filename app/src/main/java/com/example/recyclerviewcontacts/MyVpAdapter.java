package com.example.recyclerviewcontacts;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyVpAdapter extends FragmentPagerAdapter{

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    public MyVpAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    //alt+insert-overridemethods-getpagetitle
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    // to pass list make a method, there's already a default constructor so we are using a new method
    // (after this make object of adapter in tabbedact.java)

    public void addFragments(Fragment fragment, String title){
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
