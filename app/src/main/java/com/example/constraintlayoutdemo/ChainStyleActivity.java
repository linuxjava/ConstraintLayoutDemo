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
            case MainActivity.DIMENSION_RATIO:
                layoutId = R.layout.layout_dimension_ratio;
                break;
            case MainActivity.GUIDE_LINE:
                layoutId = R.layout.layout_guide_line;
                break;
            case MainActivity.BARRIER:
                layoutId = R.layout.layout_barrier;
                break;
            case MainActivity.VISIBILITY:
                layoutId = R.layout.layout_visibility;
                break;
            case MainActivity.CIRCULAR_POSITIONING:
                layoutId = R.layout.layout_circular_positioning;
                break;
            case MainActivity.CONSTRAINED_WIDTH_HEIGHT:
                layoutId = R.layout.layout_constrained_width_height;
                break;
            case MainActivity.OTHER:
                layoutId = R.layout.layout_other;
                break;
        }
        setContentView(layoutId);
    }
}
