package com.gregzanin;

public class Main {

    public static void main(String[] args) {
//        //Pillow instancing
//        Pillow pillow = new Pillow(new Dimensions(0.05,0.15,0.75), "Cotton");
//        //Bed instancing
//        Bed bed = new Bed(new Dimensions(0.5,2,1), "Wood", pillow, true);
//        //Carpet instancing
//        Carpet carpet = new Carpet(new Dimensions(0.01,3,1), "Blue", true);
//        //Ceiling instancing
//        Ceiling ceiling = new Ceiling(new Dimensions(3,4,4),"Marble");
//        //Door instancing
//        Door door = new Door(new Dimensions(2.5,0.5,0.05));
//        //Floor instancing
//        Floor floor = new Floor(new Dimensions(0,4,4), "Marble");
//        //Window instancing
//        Window window = new Window(new Dimensions(0.5,0.5,0.10),"Wood", false);
//        //Room instancing
//        Room room = new Room(ceiling,floor,door,window,bed,carpet);
//        All the room instancing in one code line:
        Room room = new Room(
                new Ceiling(new Dimensions(3,4,4),"Marble"),
                new Floor(new Dimensions(0,4,4), "Marble"),
                new Door(new Dimensions(2.5,0.5,0.05), "Wood", "Round",false),
                new Window(new Dimensions(0.5,0.5,0.10),"Wood", false),
                new Bed(new Dimensions(0.5,2,1), "Wood", true,
                        new Pillow(new Dimensions(0.05,0.15,0.75), "Cotton")),
                new Carpet(new Dimensions(0.01,3,1), "Blue", true));

        room.getBed().untidy();
        if(room.getBed().isTidy())
            System.out.println("The bed is tidy");
        else
            System.out.println("The bed is not tidy");

        room.closeCarpet();
    }
}
