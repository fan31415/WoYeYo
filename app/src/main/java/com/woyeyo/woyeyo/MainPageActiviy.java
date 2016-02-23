package com.woyeyo.woyeyo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewSwitcher;
import me.codeboy.android.cycleviewpager.CycleViewPager;
import me.codeboy.android.cycleviewpager.example.util.ViewFactory;
import java.util.ArrayList;
import java.util.List;

import me.codeboy.android.cycleviewpager.CycleViewPager;

public class MainPageActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        List<View> views=new ArrayList<View>();
        views.add( )
        CycleViewPager cycleViewPager = (CycleViewPager) getFragmentManager()
                .findFragmentById(R.id.cycleViewPager);
        cycleViewPager.setCycle(true);
        cycleViewPager.setData(views);
        cycleViewPager.setWheel(true);
    }

}
