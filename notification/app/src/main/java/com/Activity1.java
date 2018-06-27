package com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.hy.app.ui1.R;

/**
 * Activity标准形式
 *
 */
public class Activity1 extends AppCompatActivity {
    Button notification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);

        Log.v("060", "Activity1 : ");

        initView();  //初始化view
        initListener();  //初始化多个监听事件
    }

    private void initView(){
    }

    private void initListener(){
    }
    private class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {  //同时监听多个事件
            switch (v.getId()) {
                default:
                    break;
            }
        }
    }

}
