package home_work_6;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        for (int i = 0; i < 11; i++) {
            int multiplication = a * i;
            System.out.println(a + " X " + i + " = " + multiplication);
        }
    }
}
