package com.malong.toutiao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lzh.nonview.router.anno.RouterRule;

@RouterRule("MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
