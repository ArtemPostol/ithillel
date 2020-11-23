package second_lesson;

import java.util.Scanner;

public class CelsiusConvector {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);
        System.out.print("Введите градусы в Фаренгейте: ");

        double fahrenheit = input.nextDouble();
        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);

        System.out.println(fahrenheit + " градусов по Фаренгейту равна " + celsius + " по Цельсию");
    }

}
