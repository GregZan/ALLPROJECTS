package com.gregzanin;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 10, 5, true);

        printer.fillToner(30);
        if (printer.getTonerLvl() < 100) {
            System.out.println(printer.getTonerLvl() + "% of the toner level is filled");
        }
        printer.printPage(3,true);
    }
}
