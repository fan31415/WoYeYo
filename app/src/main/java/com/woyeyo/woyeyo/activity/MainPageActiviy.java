package com.woyeyo.woyeyo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewSwitcher;

import com.woyeyo.woyeyo.R;

import me.codeboy.android.cycleviewpager.CycleViewPager;

import java.util.ArrayList;
import java.util.List;



public class MainPageActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        List<View> views=new ArrayList<View>();

        CycleViewPager cycleViewPager = (CycleViewPager) getFragmentManager()
                .findFragmentById(R.id.cycleViewPager);
        cycleViewPager.setCycle(true);
        cycleViewPager.setData(views);
        cycleViewPager.setWheel(true);
    }

}
