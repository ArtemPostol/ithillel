package fourth_lesson;

import java.util.Scanner;

public class DaysPerMonth {
    public static void main(String[] args) {
        int year, month, daysInMonth;

        Scanner input = new Scanner(System.in);
        System.out.println("Ведите номер года: ");
        year = input.nextInt();
        System.out.println("Ведите номер месяца: ");
        month = input.nextInt();

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        } else if (month == 2) {
            daysInMonth = (LeapYear.isLeapYear(year)) ? 29 : 28;
        } else {
            daysInMonth = 31;
        }

        String monthString;
        switch (month) {
            case 1:
                monthString = "Январе";
                break;
            case 2:
                monthString = "Феврале";
                break;
            case 3:
                monthString = "Марте";
                break;
            case 4:
                monthString = "Апреле";
                break;
            case 5:
                monthString = "Мае";
                break;
            case 6:
                monthString = "Июне";
                break;
            case 7:
                monthString = "Июле";
                break;
            case 8:
                monthString = "Августе";
                break;
            case 9:
                monthString = "Сентябре";
                break;
            case 10:
                monthString = "Октябре";
                break;
            case 11:
                monthString = "Ноябре";
                break;
            case 12:
                monthString = "Декабре";
                break;
            default:
                monthString = "Нет такого месяца";
                break;
        }

        System.out.println("В " + monthString + " " + year + " года " + daysInMonth + " дней");
    }
}
