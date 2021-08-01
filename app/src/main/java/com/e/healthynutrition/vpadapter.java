package com.e.healthynutrition;

import androidx.annotation.NonNull;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class vpadapter extends FragmentPagerAdapter {

    private final ArrayList<Fragment> fragmentArrayList= new ArrayList<>();
    private final ArrayList<String> fragmentTitle= new ArrayList<>();
    client frag1;
    repoter frag2;
    abuser frag3;


    public vpadapter ( @NonNull FragmentManager fm, int behavior ) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem ( int position ) {
        switch (position){
            case 0:
                frag1 = new client();
                return frag1;
            case 1:
                frag2= new repoter();
                return  frag2;
            case 2:
                frag3= new abuser();
                return  frag3;
        }
                return null;
      //  return fragmentArrayList.get(position);
    }

    @Override
    public int getCount () {
        return fragmentArrayList.size();
    }
    public void addfragment(Fragment fragment,String title){
        fragmentArrayList.add(fragment);
        fragmentTitle.add(title);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle ( int position ) {

        return fragmentTitle.get(position);

    }
}
