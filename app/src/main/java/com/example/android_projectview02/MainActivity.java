package com.example.android_projectview02;import android.app.FragmentManager;import android.app.FragmentTransaction;import android.os.Bundle;import android.widget.FrameLayout;public class MainActivity extends BaseActivity {    FrameLayout fl;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);        fl= findViewById(R.id.main_fl);        //定义Fragment        initFragment();    }    private void initFragment() {        HTMIQrCodeViewFragment fragment = new HTMIQrCodeViewFragment();        FragmentManager manager1 = getFragmentManager();        FragmentTransaction transaction = manager1.beginTransaction();        transaction.replace(R.id.main_fl,fragment);        transaction.commit();    }}