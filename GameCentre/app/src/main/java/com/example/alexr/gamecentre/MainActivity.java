package com.example.alexr.gamecentre;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
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
        View x = new View(this);
        x.setBackgroundColor(Color.rgb(128,128,128));
        container.addView(x);




        ImageView v = new ImageView(this);
        container.addView(v);
        RelativeLayout.LayoutParams p1 = new RelativeLayout.LayoutParams(200,200);
        v.setLayoutParams(p1);
        v.setY(100);
        v.setX(200);
        v.setPadding(50,50,50,50);



        ImageView k = new ImageView(this);
        container.addView(k);
        k.setBackgroundColor(Color.rgb(255,0,0));
        RelativeLayout.LayoutParams yuh = new RelativeLayout.LayoutParams(200,200);
        k.setLayoutParams(yuh);
        k.setY(100);
        k.setX(405);
    }
}
