package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Carpet {
    private Dimensions dimensions;
    private String color;
    private boolean isOpen;

    public Carpet(Dimensions dimensions, String color, boolean isOpen) {
        this.dimensions = dimensions;
        this.color = color;
        this.isOpen = isOpen;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getColor() {
        return color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void Open(){
        if (isOpen) {
            System.out.println("The carpet is already open!");
        }
        else {
            isOpen = true;
            System.out.println("The carpet is open now!");
        }
    }

    public void Close(){
        if (isOpen) {
            isOpen = false;
            System.out.println("The carpet is closed now!");
        }
        else {
            System.out.println("The carpet is already closed!");
        }
    }
}
