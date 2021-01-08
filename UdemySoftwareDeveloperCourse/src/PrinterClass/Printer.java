package PrinterClass;

//import java.lang.Math;
public class Printer {

    public static void main(String[] args) {
        Printer test = new Printer(10, true);
        test.printPages(5);
        System.out.println(test.getPagesPrinted());
    }
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel <= -1 || tonerLevel > 100)
            tonerLevel = -1;
        else
            this.tonerLevel = tonerLevel;

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int returnValue = -1;
        if (tonerAmount > 0 && tonerAmount <= 100 && this.tonerLevel + tonerAmount    <= 100) {
            this.tonerLevel += tonerAmount;
            returnValue = this.tonerLevel;
        }
        return returnValue;
    }

    public int printPages(int pages) {
        double pagesToPrint = pages;

        if (duplex) {
            pagesToPrint = Math.ceil(pagesToPrint / 2);
        }

        this.pagesPrinted += pagesToPrint;

        return (int) pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

}
