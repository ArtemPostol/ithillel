package home_work_15_2;

public class Scanner {
    public static String input() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Введите одно из значений: \"da\", \"db\", \"dc\", \"ca\", \"cb\", \"cc\"");
        return input.nextLine().toLowerCase();
    }

}
