package com.example.alexr.gamecentre.Levels;

public class LevelFactory {
    public Level getLevel(int level){
        switch (level){
            default:
                return new LevelOne();
        }
    }
}
