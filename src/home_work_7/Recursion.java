package home_work_7;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Digits sum: " + sumDigits(number));

        int[] arr = {-2, -14, -3, -1, -8};
        System.out.println("Array sum: " + sumArray(arr, arr.length));
        System.out.println("Max digit: " + maxArrayDigit(arr, 0));

    }

    public static int sumDigits(int number) {
        if (number / 10 >= 1) {
            int i = number % 10;
            int remain = number / 10;
            return i + sumDigits(remain);
        } else {
            return number;
        }
    }

    public static int sumArray(int arr[], int n) {
        if (n <=0 ){
            return 0;
        }
        return sumArray(arr, n-1) + arr[n-1];
    }

    public static int maxArrayDigit(int arr[], int max) {
        if (arr.length > max) {
            int next = maxArrayDigit(arr, max + 1);
            return (arr[max] > next) ? arr[max] : next;
        } else {
            return arr[0];
        }
    }
}
