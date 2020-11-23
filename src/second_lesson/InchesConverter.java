package second_lesson;

import java.util.Scanner;

public class InchesConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение для дюйма: ");

        double inches = input.nextInt();
        double meters = inches * 0.0254;

        System.out.println(inches + " дюйма  - это " + meters + " метра.");
    }
}
