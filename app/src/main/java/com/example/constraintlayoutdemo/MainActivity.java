package com.example.constraintlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int CHAIN_STYLE = 1;
    public static final int DIMENSION_RATIO = 2;
    public static final int GUIDE_LINE = 3;
    public static final int BARRIER = 4;
    public static final int GONE_MARGIN = 5;
    public static final int VISIBILITY = 6;
    public static final int CIRCULAR_POSITIONING = 7;
    public static final int CONSTRAINED_WIDTH_HEIGHT = 8;
    public static final int OTHER = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_chainStyle).setOnClickListener(this);
        findViewById(R.id.btn_DimensionRatio).setOnClickListener(this);
        findViewById(R.id.btn_GoneMargin).setOnClickListener(this);
        findViewById(R.id.btn_Guideline).setOnClickListener(this);
        findViewById(R.id.btn_Barrier).setOnClickListener(this);
        findViewById(R.id.btn_Visibility).setOnClickListener(this);
        findViewById(R.id.btn_circular_positioning).setOnClickListener(this);
        findViewById(R.id.btn_constrained_width_height).setOnClickListener(this);
        findViewById(R.id.btn_other).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int flag = CHAIN_STYLE;
        switch (v.getId()){
            case R.id.btn_chainStyle:
                flag = CHAIN_STYLE;
                break;
            case R.id.btn_DimensionRatio:
                flag = DIMENSION_RATIO;
                break;
            case R.id.btn_Guideline:
                flag = GUIDE_LINE;
                break;
            case R.id.btn_GoneMargin:
                flag = GONE_MARGIN;
                break;
            case R.id.btn_Barrier:
                flag = BARRIER;
                break;
            case R.id.btn_Visibility:
                flag = VISIBILITY;
                break;
            case R.id.btn_circular_positioning:
                flag = CIRCULAR_POSITIONING;
                break;
            case R.id.btn_constrained_width_height:
                flag = CONSTRAINED_WIDTH_HEIGHT;
                break;
            case R.id.btn_other:
                flag = OTHER;
                break;
        }

        Intent intent = new Intent(this, ChainStyleActivity.class);
        intent.putExtra("flag", flag);
        startActivity(intent);
    }
}
