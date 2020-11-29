package fourth_lesson;

import java.util.Scanner;

public class SumAndMeanValue {
    public static void main(String[] args) {
        int a;
        int value = 0;
        int digitCount = 5;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; ++i) {
            System.out.println("Введите цифру №:" + i);
            a = input.nextInt();
            value += a;
        }
        System.out.println("Сумма введенных цифр = " + value + ", а среднее значение = " + value / digitCount);
    }
}
