package com.example.alexr.gamecentre.Levels;

public abstract class Level{
    private int percentOfScreen;
    private String [][] levelLayout;

    public int getBottomStart(){
        return percentOfScreen;
    }

    public void setPercentOfScreen(int percent){
        this.percentOfScreen = percent;
    }

    public String[][] getLevelLayout(){
        return levelLayout;
    }

    public void setLevelLayout(String [][] layout){
        this.levelLayout = layout;
    }
}
