package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Door {
    private Dimensions dimensions;
    private String material;
    private String knobType;
    private boolean isOpen;

    public Door(Dimensions dimensions, String material, String knobType, boolean isOpen) {
        this.dimensions = dimensions;
        this.material = material;
        this.knobType = knobType;
        this.isOpen = isOpen;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public String getKnobType() {
        return knobType;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void Open(){
        if (isOpen) {
            System.out.println("The door is already open!");
        }
        else {
            isOpen = true;
            System.out.println("The door is open now!");
        }
    }

    public void Close(){
        if (isOpen) {
            isOpen = false;
            System.out.println("The door is closed now!");
        }
        else {
            System.out.println("The door is already closed!");
        }
    }
}
