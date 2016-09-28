package com.example.admin.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();
            }
        });
        initData();
    }

    private void click() {

        startActivity(new Intent(this,SecondActivity.class));
    }

    private void initData() {

        String data = getIntent().getStringExtra("data");
        Log.e("initData","---> initData data = " + data);

    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        String data = intent.getStringExtra("data");
        Log.e("onNewIntent","---> onNewIntent data = " + data);

    }
}
