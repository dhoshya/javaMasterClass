package com.OOP.EncapsulationChallenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel >-1 && tonerLevel <99){
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted =0;
    }

    public int fillThetoner(int addToTonerLevel){
        if (this.tonerLevel > 0 && this.tonerLevel < 99) {
            if( this.tonerLevel + addToTonerLevel > 100){
                System.out.println("total toner level exceeded maximum(100)");
                return -1;
            }else{
                System.out.println("Toner level was: "+this.tonerLevel);
                this.tonerLevel += addToTonerLevel;
                System.out.println("Toner level now: "+ this.tonerLevel);
                return this.tonerLevel;
            }
        }else{
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (isDuplex){
            System.out.println("Printing in duplex mode");
            pagesToPrint = (pages/2)+(pages%2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
