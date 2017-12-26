package com.example.ilan.myfavlocations;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Locations> place,discription;
    private int noOfFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        CreativeAdapter creativeAdapter = new CreativeAdapter(this, getSupportFragmentManager(),
                noOfFragments, place, discription);
        viewPager.setAdapter(creativeAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }



    private void initData() {

        noOfFragments = 1;

        place = new ArrayList<>();
        place.add(new Locations(getString(R.string.name_location_1), getString(R.string.name_discription_1), R.drawable.hadera));
        place.add(new Locations(getString(R.string.name_location_2), getString(R.string.name_discription_2), R.drawable.johnbryce));
        place.add(new Locations(getString(R.string.name_location_3), getString(R.string.name_discription_3), R.drawable.shufersal));


    }


}