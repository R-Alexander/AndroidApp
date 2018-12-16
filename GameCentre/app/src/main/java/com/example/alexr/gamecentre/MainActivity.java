package com.example.alexr.gamecentre;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
    RelativeLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        container = new RelativeLayout(this);
        setContentView(container);
        View v = new View(this);
        v.setBackgroundColor(Color.BLACK);
        container.addView(v);
        RelativeLayout.LayoutParams p1 = new RelativeLayout.LayoutParams(100,100);
        v.setLayoutParams(p1);
        v.setY(100);
        v.setX(500);
    }
}
