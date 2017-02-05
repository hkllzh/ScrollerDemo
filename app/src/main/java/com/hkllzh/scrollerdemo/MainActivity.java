package com.hkllzh.scrollerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private CustomTextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTest = (CustomTextView) findViewById(R.id.tvTest);
    }

    public void onTestScroller(View view) {
        Toast.makeText(this, "testScroller", Toast.LENGTH_SHORT).show();
        tvTest.testScroller();
    }
}
