package com.example.android.minusone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.activity_main);
        Section series = new Section(this, "Education");
        series.addView(new Record(this, "Hello", "monkey", "child"));
        series.addView(new Record(this, "Hello", "monkey", "child"));
        series.addView(new Record(this, "Hello", "monkey", "child"));
        series.addView(new Record(this, "Hello", "monkey", "child"));
        Section experience = new Section(this, "Experience");
        experience.addView(new Record(this, "Did","Some","Thing"));
        experience.addView(new Record(this, "Did","Some","Thing"));
        experience.addView(new Record(this, "Did","Some","Thing"));
        experience.addView(new Record(this, "Did","Some","Thing"));
        mainLayout.addView(series);
        mainLayout.addView(experience);
    }


}
