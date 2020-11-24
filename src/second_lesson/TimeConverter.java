package second_lesson;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;

        System.out.print("Введите минуты: ");
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int years = input/(MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR);
        int days = (input%(MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR))/(MINUTES_IN_HOUR * HOURS_IN_DAY);

        System.out.println (input + " минут - это примерно " + years + " лет и " + days + " дней.");
    }
}
