package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Floor {
    private Dimensions dimensions;
    private String material;

    public Floor(Dimensions dimensions, String material) {
        this.dimensions = dimensions;
        this.material = material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getMaterial() {
        return material;
    }
}
