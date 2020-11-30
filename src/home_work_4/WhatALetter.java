package home_work_4;

import java.util.Scanner;

public class WhatALetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите букву алфавита: ");
        String letter = input.nextLine().toLowerCase();

        int letterCode = letter.codePointAt(0);
        int i = 0;

        switch (letterCode) {
            case 1072:
            case 1091:
            case 1086:
            case 1099:
            case 1080:
            case 1101:
            case 1103:
            case 1102:
            case 1105:
            case 1077:
                i++;
        }

        if (letter.length() > 1) {
            System.out.println("Здесь явно больше 1-го символа, попробуй снова");
        } else if (i == 1) {
            System.out.println("\"Гласная буква\"");
        } else if (letterCode < 1072 || letterCode > 1103) {
            System.out.println("Данный символ не является буквой русского алфавита");
        } else {
            System.out.println("\"Согласная буква\"");
        }
    }
}
