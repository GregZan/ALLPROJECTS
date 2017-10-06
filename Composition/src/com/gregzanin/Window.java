package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Window {
    private Dimensions dimensions;
    private String material;
    private boolean isOpen;

    public Window(Dimensions dimensions, String material, boolean isOpen) {
        this.dimensions = dimensions;
        this.material = material;
        this.isOpen = isOpen;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void Open(){
        if (isOpen) {
            System.out.println("The window is already open!");
        }
        else {
            isOpen = true;
            System.out.println("The window is open now!");
        }
    }

    public void Close(){
        if (isOpen) {
            isOpen = false;
            System.out.println("The window is closed now!");
        }
        else {
            System.out.println("The window is already closed!");
        }
    }
}
