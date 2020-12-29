package home_work_13_2;


public class Printer {
    private final double printerConsumptionCoefficient = 0.01;

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
        System.out.println("Заполняем картридж тонером на: " + tonerLevel + " %");
        if (tonerLevel + this.tonerLevel > 100) {
           this.tonerLevel = 100;
        } else {
            this.tonerLevel += tonerLevel;
        }
    }

    public void printedPage(int sheets) {
        if (this.checkToner(sheets)) {
            System.out.println("Недостаточно тонера");
            this.printedPages = 0;
            return;
        } else {
            if (isDuplexPrinter()) {
                this.printedPages = sheets * 2;
            } else {
                this.printedPages = sheets;
            }

        }
        System.out.println("Увеличиваем счетчик напечатаных страниц");
        this.tonerConsumption(this.getPrintedPages(), isDuplexPrinter());
    }

    public boolean checkToner(int sheets) {
        System.out.println("Проверяем достаточно ли тонера для печати");
        if (isDuplexPrinter()) {
            return this.tonerLevel < (sheets * 2) * printerConsumptionCoefficient;
        } else {
            return this.tonerLevel < sheets * printerConsumptionCoefficient;
        }
    }

    public void tonerConsumption(int pages, boolean isDuplexPrinter) {
        System.out.println("Уменьшаем кол-во тонера в картридже в зависимости от кол-ва страниц и типа принтера");
            this.tonerLevel -= (pages * printerConsumptionCoefficient);
    }

    public Printer(int tonerLevel, boolean isDuplexPrinter) {
        this.tonerFilling(tonerLevel);
        this.setDuplexPrinter(isDuplexPrinter);
    }
}
