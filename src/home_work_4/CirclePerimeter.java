package home_work_4;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        double radius, perimeter, area;
        final int perimeterConst = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Ведите радиус круга: ");
        radius = input.nextDouble();

        perimeter = perimeterConst * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);
    }
}
