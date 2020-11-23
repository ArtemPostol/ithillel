package second_lesson;

import java.util.Scanner;

public class SummationDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите трехзначное число от 100 до 999: ");

        int number = input.nextInt();
        int digit1 = number / 100;
        int digit2 = (number % 100) / 10;
        int digit3 = number % 10;
        int sum = digit1 + digit2 + digit3;

        System.out.println("Сумма всех цифр в " + number + " равна " + sum);
    }
}
