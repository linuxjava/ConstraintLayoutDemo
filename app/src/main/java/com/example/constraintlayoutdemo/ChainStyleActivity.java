package com.example.constraintlayoutdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class ChainStyleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int flag = getIntent().getIntExtra("flag", MainActivity.CHAIN_STYLE);
        int layoutId = 0;
        switch (flag){
            case MainActivity.CHAIN_STYLE:
                layoutId = R.layout.activity_chain_style;
                break;
            case MainActivity.GONE_MARGIN:
                layoutId = R.layout.activity_gone_margin;
                break;
        }
        setContentView(layoutId);
    }
}
