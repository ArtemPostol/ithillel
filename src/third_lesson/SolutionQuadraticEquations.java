package third_lesson;

import java.util.Scanner;

public class SolutionQuadraticEquations {
    public static void main(String[] args) {
        double a, b, c;
        double d;
        double x1, x2;
        double x;
        double exhibitor = 2;
        int DISCRIMINANT_CALCULATING_CONST = 4;
        int ROOT_CALCULATING_CONST = 2 ;
        Scanner input = new Scanner(System.in);

        System.out.println("Эта программа решает квадратное уравнение вида: ax^2 + bx + c = 0");
        System.out.println("Введите а: ");
        a = input.nextDouble();
        System.out.println("Введите b: ");
        b = input.nextDouble();
        System.out.println("Введите c: ");
        c = input.nextDouble();

        d = Math.pow(b, exhibitor) - (DISCRIMINANT_CALCULATING_CONST * a * c);
        if (d > 0) {
            x1 = (-b + Math.sqrt(d)) / (ROOT_CALCULATING_CONST * a);
            x2 = (-b - Math.sqrt(d)) / (ROOT_CALCULATING_CONST * a);
            System.out.println("Корни уравнения равны: x1 = " + x1 + ", x2 = " + x2);
        } else if (d == 0) {
            x = -b / (ROOT_CALCULATING_CONST * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет  корней");
        }
    }
}
