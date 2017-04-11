package com.ti4n.gank;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ncapdevi.fragnav.FragNavController;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;
import com.ti4n.gank.fragment.FuliFragment;
import com.ti4n.gank.fragment.TodayFragment;

import java.util.ArrayList;
import java.util.List;

import static com.ti4n.gank.R.id.tab_catagory;
import static com.ti4n.gank.R.id.tab_favorite;
import static com.ti4n.gank.R.id.tab_fuli;
import static com.ti4n.gank.R.id.tab_today;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> fragments = new ArrayList<>(2);

        fragments.add(TodayFragment.newInstance());
        fragments.add(FuliFragment.newInstance());

        final FragNavController fragNavController =
                new FragNavController(savedInstanceState, getSupportFragmentManager(), R.id.contentContainer, fragments,0);

        final TodayFragment todayFragment=new TodayFragment();
        final FuliFragment fuliFragment=new FuliFragment();
        final FragmentManager fragmentManager=getSupportFragmentManager();


        BottomBar bottomBar= (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case tab_today:fragNavController.switchTab(FragNavController.TAB1);
                        break;
                    case tab_catagory:
                        break;
                    case tab_favorite:
                        break;
                    case tab_fuli:fragNavController.switchTab(FragNavController.TAB2);
                }
            }
        });
        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {

            }
        });

    }

}
