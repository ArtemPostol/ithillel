package home_work_6;

import java.util.Scanner;

public class DigitsCounter {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(sumDigits(number));
    }

    public static Integer sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        String strObj = new Integer(number).toString();
        int sum = 0;
        int i = strObj.length();
        while (i != 0) {
            i--;
            int digit = strObj.charAt(i) - '0';
            sum += digit;
        }
        return sum;
    }
}
