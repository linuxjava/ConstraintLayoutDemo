package com.example.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int CHAIN_STYLE = 1;
    public static final int GONE_MARGIN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_chainStyle).setOnClickListener(this);
        findViewById(R.id.btn_GoneMargin).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int flag = CHAIN_STYLE;
        switch (v.getId()){
            case R.id.btn_chainStyle:
                flag = CHAIN_STYLE;
                break;
            case R.id.btn_GoneMargin:
                flag = GONE_MARGIN;
                break;
        }

        Intent intent = new Intent(this, ChainStyleActivity.class);
        intent.putExtra("flag", flag);
        startActivity(intent);
    }
}
