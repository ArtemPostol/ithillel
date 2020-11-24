package second_lesson;

import java.util.Scanner;

public class InchesConverter {
    public static void main(String[] args) {
        final double METERS_CONVERSION_COEFFICIENT = 0.0254;

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение для дюйма: ");

        double inches = input.nextInt();
        double meters = inches * METERS_CONVERSION_COEFFICIENT;

        System.out.println(inches + " дюйма  - это " + meters + " метра.");
    }
}
