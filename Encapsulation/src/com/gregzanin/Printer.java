package com.gregzanin;

/**
 * Created by GR389658 on 22/09/2017.
 */
public class Printer {
    private int tonerLvl;
    private int pagesReady;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLvl, int pagesReady, boolean isDuplex) {
        this.tonerLvl = tonerLvl;
        this.pagesReady = pagesReady;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillToner(int inkAdded){
        if (inkAdded + tonerLvl > 100){
            tonerLvl = 100;
            System.out.println("Toner is full now! Around " + ((inkAdded + tonerLvl)-100) + "% of the toner ink level was left over");
        }
        else {
            tonerLvl += inkAdded;
        }
        return tonerLvl;
    }

    public void printPage(int pagesToPrint) {
        if (pagesToPrint > pagesReady){
            System.out.println("You dont have enough pages to print " + pagesToPrint + " you need " + (pagesToPrint - pagesReady) + " more ready page(s) to print that amount!");
        }
        else{
            System.out.println(pagesToPrint + " pages were printed!");
            pagesReady -= pagesToPrint;
            pagesPrinted += pagesToPrint;
        }
    }

    public void printPage(int pagesToPrint, boolean isDuplex) {
        if (isDuplex && !this.isDuplex) {
            System.out.println("This printer is not duplex! It is not capable of printing both sides of the paper!");
        }
        else {
            if (pagesToPrint > pagesReady){
                System.out.println("You dont have enough pages to print " + pagesToPrint + " you need " + (pagesToPrint - pagesReady) + " more ready page(s) to print that amount!");
            }
            else{
                System.out.println(pagesToPrint + " pages were printed!");
                pagesReady -= pagesToPrint;
                pagesPrinted += pagesToPrint;
            }
        }
    }

    public int getTonerLvl() {
        return tonerLvl;
    }

    public int getPagesReady() {
        return pagesReady;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
