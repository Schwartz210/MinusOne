package com.example.android.minusone;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by aschwartz on 3/1/2017.
 */

public class Record extends LinearLayout {
    public Record(Context context, String text1, String text2, String text3) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);
        TView boxOne = new TView(context, text1);
        TView boxTwo = new TView(context, text2);
        TView boxThree = new TView(context, text3);
        boxOne.setLayoutWeight(1.0f);
        boxTwo.setLayoutWeight(3.0f);
        boxThree.setLayoutWeight(1.0f);
        addView(boxOne);
        addView(boxTwo);
        addView(boxThree);
    }
}
