package com.OOP.EncapsulationChallenge;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(40,true);

        System.out.println("Initial number of pages: "+printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(45);

        printer.fillThetoner(100);

        System.out.println("Total number of pages: "+printer.getPagesPrinted());

    }
}
