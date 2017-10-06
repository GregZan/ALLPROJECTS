package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Dimensions {
    private double height;
    private double width;
    private double depth;


    public Dimensions(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getDepth() {
        return depth;
    }

}
