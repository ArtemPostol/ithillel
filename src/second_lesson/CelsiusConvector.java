package second_lesson;

import java.util.Scanner;

public class CelsiusConvector {
    public static void main(String[] Strings) {
        final double CELSIUS_CONVERSION_COEFFICIENT = 1.8;
        final double FREEZING_POINT_FAHRENHEIT = 32;

        Scanner input = new Scanner(System.in);
        System.out.print("Введите градусы в Фаренгейте: ");

        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - FREEZING_POINT_FAHRENHEIT)/CELSIUS_CONVERSION_COEFFICIENT;

        System.out.println(fahrenheit + " градусов по Фаренгейту равна " + celsius + " по Цельсию");
    }

}
