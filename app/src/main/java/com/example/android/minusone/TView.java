package com.example.android.minusone;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.width;

/**
 * Created by aschwartz on 3/2/2017.
 */

public class TView extends TextView {
    private int mWidth = LinearLayout.LayoutParams.WRAP_CONTENT;
    private int mHeight = LinearLayout.LayoutParams.WRAP_CONTENT;
    private float mWeight = 0;
    public TView(Context context, String text){
        super(context);
        setText(text);
        setLayoutParams(new LinearLayout.LayoutParams(mWidth, mHeight, mWeight));
    }

    public void setLayoutWeight(float weight){
        setLayoutParams(new LinearLayout.LayoutParams(0, mHeight, weight));
        mWeight = weight;
    }

    public void setLayoutWidth(int width){
        setLayoutParams(new LinearLayout.LayoutParams(width, mHeight, 0));
        mWidth = width;
    }

    public void setLayoutHeight(int height){
        setLayoutParams(new LinearLayout.LayoutParams(mWidth, height, mWeight));
        mHeight = height;
    }
}
