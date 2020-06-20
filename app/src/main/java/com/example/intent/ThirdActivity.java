package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/*
* 为了让你能够更加直观地理解，我们来自己建立一个活动，让它也能响应打开网页的Intent。
* */
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
}