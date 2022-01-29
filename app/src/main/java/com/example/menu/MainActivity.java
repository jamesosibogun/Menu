package com.example.menu;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
public class MainActivity extends AppCompatActivity {
    private TabAdapter tabAdapter ;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewpager);
        // setting up the adapter
        tabAdapter = new TabAdapter(getSupportFragmentManager());
        // add the fragments
        tabAdapter.add(new Vegan(), "Vegan");
        tabAdapter.add(new Meat(), "Meat");
        tabAdapter.add(new Keto(), "Vegetarian");
        tabAdapter.add(new Meat(), "Keto");
        // Set the adapter
        viewPager.setAdapter(tabAdapter);
        // The Page (fragment) titles will be displayed in the
        // tabLayout hence we need to set the page viewer
        // we use the setupWithViewPager().
        tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}

