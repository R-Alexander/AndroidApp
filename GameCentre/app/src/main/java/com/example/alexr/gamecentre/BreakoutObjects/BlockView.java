package com.example.alexr.gamecentre.BreakoutObjects;

import android.widget.ImageView;

public class BlockView extends Block {
    private ImageView v;

    public BlockView(int x, int y, int width, int height, ImageView v) {
        super(v.getId(), x, y, width, height);
        this.v = v;
    }

    public ImageView getImageView() {
        return v;
    }

}
