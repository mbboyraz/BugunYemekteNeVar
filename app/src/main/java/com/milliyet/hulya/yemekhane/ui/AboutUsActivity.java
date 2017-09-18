package com.milliyet.hulya.yemekhane.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.milliyet.hulya.yemekhane.R;
import com.milliyet.hulya.yemekhane.adapter.RecyclerAboutUsAdapter;
import com.milliyet.hulya.yemekhane.dummydata.DeveloperInformationData;
import com.milliyet.hulya.yemekhane.viewmodel.AboutUsVM;

import java.util.ArrayList;


public class AboutUsActivity extends AppCompatActivity {
    private final LinearLayoutManager layoutManager = new LinearLayoutManager(this);
    Toolbar toolbar_aboutus;
    private RecyclerView recyclerViewAboutUs = null;
    private ArrayList<AboutUsVM> listAboutUs = null;
    private RecyclerAboutUsAdapter recyclerAboutUsAdapter = null;
    private LinearLayoutManager aboutUsLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        aboutUsLayoutManager = new LinearLayoutManager(this);
        initview();



    }

    private void initview() {
        recyclerViewAboutUs = (RecyclerView) findViewById(R.id.about_us_recyclerview);
        listAboutUs = DeveloperInformationData.developerDummyList();
        recyclerAboutUsAdapter = new RecyclerAboutUsAdapter(listAboutUs);
        recyclerViewAboutUs.setAdapter(recyclerAboutUsAdapter);
        recyclerViewAboutUs.setLayoutManager(layoutManager);
        recyclerViewAboutUs.setItemAnimator(new DefaultItemAnimator());
        toolbar_aboutus = (Toolbar) findViewById(R.id.toolbar_about_us);
        toolbar_aboutus.setTitle("Hakkımızda");
        toolbar_aboutus.setTitleTextColor(getResources().getColor(R.color.color_toolbar_title, null));





    }

}

