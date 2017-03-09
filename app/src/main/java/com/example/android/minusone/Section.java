package com.example.android.minusone;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by aschwartz on 3/1/2017.
 */

public class Section extends LinearLayout {
    public Section(Context context, String heading) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
        TextView header = new TextView(context);
        header.setText(heading);
        header.setTypeface(Typeface.DEFAULT_BOLD);
        addView(header);
    }
}
