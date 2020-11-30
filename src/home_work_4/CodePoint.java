package home_work_4;

import java.util.Scanner;

public class CodePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу: ");
        String phrase = sc.nextLine();

        System.out.println("Character(at index 1) = " + phrase.codePointAt(1));
        System.out.println("Character(at index 3) = " + phrase.codePointAt(3));
        System.out.println("Character(at index 9) = " + phrase.codePointAt(9));
    }
}
