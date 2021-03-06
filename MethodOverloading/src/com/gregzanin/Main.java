package com.gregzanin;

public class Main {

    public static void main(String[] args) {


    double centimeters = calcFeetAndInchesToCentimeters(6, 0);
    if (centimeters < 0.0) {
        System.out.println("Invalid Parameters");
    }

    calcFeetAndInchesToCentimeters(157);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        if ((feet >= 0) && (inches >=0 && inches <=12)) {
            double centimeters = (feet*30.48)+(inches*2.54);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;

        }
        else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >=0) {

            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " inches.");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        }
        else {
            return -1;
        }
    }
}
