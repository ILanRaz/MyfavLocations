package com.example.ilan.myfavlocations;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class CreativeAdapter  extends FragmentPagerAdapter {

    private int fragmentCount;
    private Context context;
    private ArrayList<Locations> place, discription;

    public CreativeAdapter(Context context, FragmentManager fm,
                                    int fragmentCount,
                                    ArrayList<Locations> place,
                                    ArrayList<Locations> discription
                                   ) {
        super(fm);
        this.context = context;
        this.fragmentCount = fragmentCount;
        this.place = place;
        this.discription = discription;

    }

    @Override
    public Fragment getItem(int position) {

        MapsFragment newFragment = new MapsFragment();
        Bundle bundle = new Bundle();

        if (position == 0) {
            bundle.putSerializable("arrayList", place);
            newFragment.setArguments(bundle);
            return newFragment;
        }
        else if( position == 1) {
            bundle.putSerializable("arrayList", discription);
            newFragment.setArguments(bundle);
            return newFragment;
        }

        return null;

    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) return context.getString(R.string.fragment_locations);
        else if (position == 1) return context.getString(R.string.fragment_discription);
        else return context.getString(R.string.fragment_otherLocations);
    }

    @Override
    public int getCount() {
        return fragmentCount;
    }
}
