package com.example.alexr.gamecentre.BreakoutObjects;


import java.util.Objects;

public class Block {
    private int x;
    private int y;
    private  int width;
    private int height;
    private int id;

    public Block(int id,int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return x == block.x &&
                y == block.y &&
                width == block.width &&
                height == block.height &&
                id == block.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, width, height, id);
    }
}
