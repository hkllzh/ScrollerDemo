package com.hkllzh.scrollerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView tvTest;
    private Scroller mScroller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTest = (TextView) findViewById(R.id.tvTest);
    }

    public void onTestScroller(View view) {
        if (null == mScroller) {
            mScroller = new Scroller(this);
            tvTest.setScroller(mScroller);
        }
        Toast.makeText(this, "testScroller", Toast.LENGTH_SHORT).show();
        mScroller.startScroll(tvTest.getScrollX(), tvTest.getScrollY(), -100, -100, 3000);
        tvTest.invalidate();
    }
}
