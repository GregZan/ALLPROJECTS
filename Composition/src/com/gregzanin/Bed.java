package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Bed {
    private Dimensions dimensions;
    private String material;
    private boolean isTidy;
    private Pillow pillow;


    public Bed(Dimensions dimensions, String material, Boolean isTidy, Pillow pillow) {
        this.dimensions = dimensions;
        this.material = material;
        this.isTidy = isTidy;
        this.pillow = pillow;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }

    public Pillow getPillow() {
        return pillow;
    }

    public boolean isTidy() {
        return isTidy;
    }

    public void tidyUp() {
        if (isTidy) {
            System.out.println("The bed is already tidy!");
        }
        else {
            isTidy = true;
            System.out.println("The bed is tidy now!");
        }
    }
    public void untidy() {
        if (isTidy) {
            isTidy = false;
            System.out.println("The bed is untidy now!");
        }
        else {
            System.out.println("The bed is already untidy!");
        }
    }
}
