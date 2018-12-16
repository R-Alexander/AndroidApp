package com.example.alexr.gamecentre.BreakoutObjects;

import android.view.View;

public class BlockView extends Block {
    private View v;

    public BlockView(int x, int y, int width, int height, View v) {
        super(v.getId(), x, y, width, height);
        this.v = v;
    }

    public View getV() {
        return v;
    }

    public void setV(View v) {
        this.v = v;
    }
}
