package com.company.step.Boxes;

/**
 * Created by ivan on 12.03.2016.
 */
public class Boxes {
    private int  width;
    private int height;
    private int depth;
    private int volume;

    public Boxes (int w, int h, int d)   {
        setWidth(w);
        setDepth(d);
        setHeight(h);
        setVolume(w*h*d);
    }

    public Boxes() {

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

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
