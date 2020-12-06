package body_mass_index;

import java.util.Scanner;

public class MainBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = input.nextLine();

        System.out.println("Введите ваш вес в киллограмах: ");
        double weight = input.nextDouble();
        if (weight <= 0 || weight >= 650) { //верхнее значение вес самого тяжелого человекка
            System.out.println("Не бвает людей с весом " + weight + " кг.");
            return;
        }

        System.out.println("Введите ваш  рост в метрах: ");
        double height = input.nextDouble();
        if (height <= 0 || height >= 2.72) { //верхнее значение рост самого высокого человекка
            System.out.println("Не бвает людей с ростом " + height + " м.");
            return;
        }
//        System.out.println(BodyMassIndex.calculateBodyMassIndex(weight, height));
        double bmi = BodyMassIndex.calculateBodyMassIndex(weight, height);

        BodyMassIndex.printResult(name, weight, height, bmi);
    }
}
