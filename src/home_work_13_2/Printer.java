package home_work_13_2;

public class Printer {

    private double tonerLevel;
    private int printedPages;
    private boolean isDuplexPrinter;

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }

    public void tonerFilling(int tonerLevel) {
        if (tonerLevel + this.tonerLevel > 100) {
            System.out.println("Тонер не может быть заполенен более чем на 100%");
        } else {
            this.tonerLevel += tonerLevel;
        }
    }

    public void printedPage(int sheets) {
        for (int i = 0; i <= sheets; i++) {
            if (isDuplexPrinter()) {
                this.printedPages = i * 2;
            } else {
                this.printedPages = i;
            }
        }
        this.tonerConsumption(this.getPrintedPages(), isDuplexPrinter());
    }

    public void tonerConsumption(int pages, boolean isDuplexPrinter) {
        double duplexPrinterConsumptionCoefficient = 0.2;
        double printerConsumptionCoefficient = 0.1;

        if (isDuplexPrinter) {
            this.tonerLevel -= (pages * duplexPrinterConsumptionCoefficient);
        } else {
            this.tonerLevel -= (pages * printerConsumptionCoefficient);
        }
    }

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        this.tonerFilling(tonerLevel);
        this.setDuplexPrinter(isDuplexPrinter);
    }
}
