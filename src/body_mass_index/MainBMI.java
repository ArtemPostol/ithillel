package body_mass_index;

import java.util.Scanner;

public class MainBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = input.nextLine();
        System.out.println("Введите ваш вес в киллограмах: ");
        double weight = input.nextDouble();
        System.out.println("Введите ваш  рост в метрах: ");
        double height = input.nextDouble();

//        System.out.println(BodyMassIndex.calculateBodyMassIndex(weight, height));
        double bmi = BodyMassIndex.calculateBodyMassIndex(weight, height);

        BodyMassIndex.printResult(name, weight, height, bmi);
    }
}
