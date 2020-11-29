package fourth_lesson;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int largestValue = Integer.MIN_VALUE;
        for (int i = 1; i < 4; i++) {
            System.out.println("Введите число № " + i);
            int firstValue = input.nextInt();

            if (firstValue > largestValue) {
                largestValue = firstValue;
            }
        }
        System.out.println("Наибольшее число: " + largestValue);
    }
}
