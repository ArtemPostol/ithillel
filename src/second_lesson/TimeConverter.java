package second_lesson;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        System.out.print("Введите минуты: ");
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int years = input/525600;
        int days = (input%525600)/1440;

        System.out.println (input + " минут - это примерно " + years + " лет и " + days + " дней.");
    }
}
