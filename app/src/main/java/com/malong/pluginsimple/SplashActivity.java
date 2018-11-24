package com.malong.pluginsimple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lzh.nonview.router.anno.RouterRule;

@RouterRule("SplashActivity")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
