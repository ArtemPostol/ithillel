package home_work_4;

public class CharacterClasses {
    public static void main(String[] args) {

        char upperCaseLetter = 'A';
        char lowerCaseLetter = 'b';
        char digit = '1';
        char whiteSpace = ' ';

        System.out.println(upperCaseLetter + " is Letter? " + Character.isLetter(upperCaseLetter)); // указывает является ли char буквой
        System.out.println(digit + " is Digit? " + Character.isDigit(digit)); //указывает является ли char цифрой
        System.out.println(whiteSpace + " is whitespace? " + Character.isWhitespace(whiteSpace)); //указывает является ли char пробелом
        System.out.println(lowerCaseLetter + " is upper case? " + Character.isUpperCase(lowerCaseLetter)); // указывает является ли char буквой в верхнем регистре
        System.out.println(upperCaseLetter + " is lower case? " + Character.isLowerCase(upperCaseLetter)); // указывает является ли char буквой в нижнем регистре
        System.out.println(lowerCaseLetter + " to upper case " + Character.toUpperCase(lowerCaseLetter)); //приводит char к верхнему регистру
        System.out.println(upperCaseLetter + " to lower case " + Character.toLowerCase(upperCaseLetter)); //приводит char к нижнему регистру
        System.out.println(digit + " to string " +  Character.toString(digit)); //преобразует char в строку

    }
}
