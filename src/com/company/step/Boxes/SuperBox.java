package com.company.step.Boxes;

/**
 * Created by ivan on 12.03.2016.
 */
public class SuperBox extends Boxes {
    private int height;


    public SuperBox(int w, int h, int d){
        super.setWidth(w);
        super.setHeight(h+10);
        super.setDepth(d);
    }

    @Override
    public void setHeight(int height) {
        this.height = height+10;
    }
}