package com.company.step;

import com.company.step.Boxes.Boxes;
import com.company.step.Boxes.SuperBox;

public class Main {

    public static void main(String[] args) {

        Boxes box1 = new Boxes(10, 10, 10);
        SuperBox box2 = new SuperBox(10, 10, 10);

        System.out.println(box1.getHeight());
        System.out.println(box2.getHeight());

	// write your code here
    }
}
