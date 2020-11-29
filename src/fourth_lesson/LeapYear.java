package fourth_lesson;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Ведите год: ");
        year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Год представляет собой високосный год (в нем 366 дней).");
                }
            } else {
                System.out.println("Год представляет собой високосный год (в нем 366 дней).");
            }
        } else {
            System.out.println("Год не является високосным (365 дней).");
        }
    }

    public static boolean isLeapYear (int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
