package com.gregzanin;

/**
 * Created by GR389658 on 21/09/2017.
 */
public class Room {
    private Ceiling ceiling;
    private Floor floor;
    private Door door;
    private Window window;
    private Bed bed;
    private Carpet carpet;

    public Room(Ceiling ceiling, Floor floor, Door door, Window window, Bed bed, Carpet carpet) {
        this.ceiling = ceiling;
        this.floor = floor;
        this.door = door;
        this.window = window;
        this.bed = bed;
        this.carpet = carpet;
    }


    public Ceiling getCeiling() {
        return ceiling;
    }

    public Floor getFloor() {
        return floor;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public Bed getBed() {
        return bed;
    }

    public void openCarpet(){
        carpet.Open();
    }

    public void closeCarpet(){
        carpet.Close();
    }

}
