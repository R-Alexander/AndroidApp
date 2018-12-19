package com.example.alexr.gamecentre.GameActivities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.alexr.gamecentre.BreakoutGame.BreakoutManager;
import com.example.alexr.gamecentre.BreakoutObjects.Block;
import com.example.alexr.gamecentre.BreakoutObjects.BlockView;

public class MainActivity extends Activity{
    RelativeLayout container;
    int screenHeight;
    int screenWidth;
    BreakoutManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getScreenDimensions();
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        container = new RelativeLayout(this);
        setContentView(container);
        View x = new View(this);
        x.setBackgroundColor(Color.rgb(128, 128, 128));
        container.addView(x);


        ImageView slider = new ImageView(this);
        Block sliderBlock = new BlockView(100, 100, 100, 200, slider);
        container.addView(slider);
        slider.setBackgroundColor(Color.rgb(255, 0, 0));
        RelativeLayout.LayoutParams yuh = new RelativeLayout.LayoutParams(sliderBlock.getWidth(), sliderBlock.getHeight());
        slider.setLayoutParams(yuh);


        manager = new BreakoutManager();
        manager.setSlider(sliderBlock);
        BlockView sliderBlockView = (BlockView) manager.getSlider();
        ImageView v = sliderBlockView.getImageView();
        v.setX(sliderBlock.getX());
        v.setY(sliderBlock.getY());

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        BlockView slider = (BlockView) manager.getSlider();
        ImageView v = slider.getImageView();
        if(x <=1){
            slider.setX(1);
            v.setX(slider.getX());
        }
        else if (x + slider.getWidth() <= screenWidth){
            slider.setX(x);
            v.setX(slider.getX());
        }
        else{
            slider.setX(screenWidth-slider.getWidth());
            v.setX(slider.getX());
        }
        return false;
    }

    /**
     * set the screen height and width in pixels
     */
    public void getScreenDimensions() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenHeight = displayMetrics.heightPixels;
        screenWidth = displayMetrics.widthPixels;
    }


}
