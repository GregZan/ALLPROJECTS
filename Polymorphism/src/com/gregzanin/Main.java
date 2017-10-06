package com.gregzanin;

import java.util.Random;

class Car {
    private String name;
    private boolean engine;
    private double currentSpeed;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name, int cylinders, int doors) {
        this.name = name;
        this.cylinders = cylinders;
        this.doors = doors;
        engine = true;
        wheels = 4;
        currentSpeed = 0;
    }

    public void startEngine() {
        if (engine) {
            System.out.println("The engine is already turned on!");
        }
        else {
            System.out.println("Engine turned on!");
            engine = true;
        }

    }

    public void turnOffEngine() {
        if (!engine) {
            System.out.println("The engine is already turned off!");
        }
        else {
            System.out.println("Engine turned off!");
            engine = false;
        }

    }

    public double accelerate(double speedIncrease){
        if(speedIncrease <=0){
            return -1;
        }
        else {
            currentSpeed += speedIncrease;
            System.out.println("The car speed increased by: " + speedIncrease + "!");
            return currentSpeed;
        }
    }
    public void brake(){
        setCurrentSpeed(0);
        System.out.println("The car have stopped!");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCilynders() {
        return cylinders;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
}

class Ferrari extends Car{
    public Ferrari(){
        super("Ferrari",4,4);
    }

    public void startEngine() {
        if (isEngine()) {
            System.out.println("The Ferrari is already turned on!");
        }
        else {
            System.out.println("Ferrari turned on!");
            setEngine(true);
        }

    }

    public void turnOffEngine() {
        if (!isEngine()) {
            System.out.println("The Ferrari is already turned off!");
        }
        else {
            System.out.println("Ferrari turned off!");
            setEngine(false);
        }

    }

    public double accelerate(double speedIncrease){
        if(speedIncrease <=0){
            return -1;
        }
        else {
            setCurrentSpeed(getCurrentSpeed() + speedIncrease);
            System.out.println("The Ferrari speed increased by: " + speedIncrease + "!");
            return getCurrentSpeed();
        }
    }
    public void brake(){
        setCurrentSpeed(0);
        System.out.println("The Ferrari have stopped!");
    }
}

class Beetle extends Car{
    public Beetle(){
        super("Beetle",2,2);
    }

    public void startEngine() {
        if (isEngine()) {
            System.out.println("The Beetle is already turned on!");
        }
        else {
            System.out.println("Beetle turned on!");
            setEngine(true);
        }

    }

    public void turnOffEngine() {
        if (!isEngine()) {
            System.out.println("The Beetle is already turned off!");
        }
        else {
            System.out.println("Beetle turned off!");
            setEngine(false);
        }

    }

    @Override
    public double accelerate(double speedIncrease){
        if(speedIncrease <=0){
            return -1;
        }
        else {
            setCurrentSpeed(getCurrentSpeed() + speedIncrease);
            System.out.println("The Beetle speed increased by: " + speedIncrease + "!");
            return getCurrentSpeed();
        }
    }
    public void brake(){
        setCurrentSpeed(0);
        System.out.println("The Beetle have stopped!");
    }
}


class Porsche extends Car{
    public Porsche(){
        super("Porsche",3,4);
    }

}
public class Main {

    public static void main(String[] args) {
        for(int i=1; i <11; i++){
            Car car = randomCar();
            System.out.println("Car #" + i +
                            ": " + car.getName() + "\n" +
                            "Number of doors: " + car.getDoors() + "\n" +
                            "Number of cylinders: " + car.getCilynders() + "\n");
            car.startEngine();
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Ferrari();
            case 2:
                return new Beetle();
            case 3:
                return new Porsche();
            default:
                return null;
        }
    }
}
