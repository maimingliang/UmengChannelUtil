package com.example.admin.demo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity  {

    private static final int REQ_CODE = 10001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });



    }

//    /**
//     * 处理自定义Dialog 的显示
//     * @param context 自定义dialog 依赖的Context，注意：自定义dialog的Context 需要使用这个
//     *
//     */
//    @Override
//    public void onShowDialog(Context context) {
//
//    }
//    /**
//     * 处理自定义Dialog 的隐藏
//     * @param context 自定义dialog 依赖的Context，注意：自定义dialog的Context 需要使用这个
//     *
//     */
//    @Override
//    public void onHideDialog(Context context) {
//
//    }
}
