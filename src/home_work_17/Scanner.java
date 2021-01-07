package home_work_17;

public class Scanner {
    public static int input(){
        System.out.print("Введите желаемое кол-во цветов в букете: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0 ) {
            return number;
        } else {
            System.out.println("Не бывает букета без цветов!");
            return input();
        }
    }
}
