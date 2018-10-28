package com.example.android.chaloudaipur;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    private int[] tabIcons = {
            R.drawable.ic_location_on_black_24dp,
            R.drawable.ic_restaurant_black_24dp,
            R.drawable.ic_shopping_cart_black_24dp,
            R.drawable.ic_event_black_24dp
    };

    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ViewPager viewPager = findViewById(R.id.viewpager);

        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager());

        tabLayout = findViewById(R.id.tabs);

        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();

    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
    }
}
