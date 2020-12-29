package home_work_13_2;

public class MainPrinter {
    public static void main(String[] args) {
        Printer printer1 = new Printer(100, false);
        printer1.printedPage(50);
        System.out.println("В принтере осталось: " + printer1.getTonerLevel() + "% тонера.");
        System.out.println("Было напечатано: " + printer1.getPrintedPages() + " страниц.");

        System.out.println("=================");

        Printer printer2 = new Printer(100,true);
        printer2.printedPage(50);
        System.out.println("В принтере осталось: " + printer2.getTonerLevel() + "% тонера.");
        System.out.println("Было напечатано: " + printer2.getPrintedPages() + " страниц.");

    }
}
