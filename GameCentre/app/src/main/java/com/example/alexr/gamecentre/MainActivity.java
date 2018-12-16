package com.example.alexr.gamecentre;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    RelativeLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        container = new RelativeLayout(this);
        setContentView(container);
        TextView v = new TextView(this);
        v.setBackgroundColor(Color.WHITE);
        container.addView(v);
        RelativeLayout.LayoutParams p1 = new RelativeLayout.LayoutParams(200,200);
        v.setLayoutParams(p1);
        v.setY(100);
        v.setX(200);
        v.setText("Seeing a change on github");
        v.setText("Hi");
        v.setText("Testing");
        v.setText("Fixed");
        v.setText("Make sure I know how this works");
        v.setText("THIS WORKS");
    }
}
