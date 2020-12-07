package home_work_6;

import java.util.Scanner;

public class WordsCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите строку:");
        String phrase = input.nextLine();
        if (phrase.length() != 0) {
            counter++;
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == ' ') {
                    counter++;
                }
            }
        }
        System.out.println("Вы ввели " + counter + " слов");
    }
}
