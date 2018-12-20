package com.example.alexr.gamecentre.BreakoutGame;

import com.example.alexr.gamecentre.BreakoutObjects.Block;
import com.example.alexr.gamecentre.BreakoutObjects.BlockView;

public class BreakoutManager {
    private Block slider;
    private SliderMovement mover = new SliderMovement();
    public Block getSlider(){
        return  slider;
    }

    public void setSlider(Block slider){
        this.slider = slider;
    }

}
