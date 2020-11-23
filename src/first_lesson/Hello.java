package first_lesson;

public class Hello {
    public static void main() { // в данном случае в методе mail пропущен аргумент String[] args;
        System.out.println("Doesn't execute");
    }
}

/*
1) Пропущен main - <identifier> expected - ожидается идентификатор
2) Пропущен String - illegal start of type - недопустимое начало типа
3) Пропущен first_lesson.Hello - <identifier> expected - идентификатор ожидается
4) Пропущен  System.out (без точки) -illegal start of expression - неправильное начало выражения
5) Пропущен System.out. (с точкой) - cannot find symbol symbol: method println(java.lang.String)location: class first_lesson.Hello -
не удается найти символ символ: метод println
6) Пропущен println (без точки) - <identifier> expected - идентификатор ожидается
7) Пропущен println (c точки) -  cannot find symbol symbol:   method out(java.lang.String) location: class java.lang.System - не удается найти символ
  символ: метод вне (java.lang.String)
  расположение: класс java.lang.System;
 */

/*
Пропущено:

 a) точку с запятой ; - Error:(3, 42) java: ';' expected - ожидается ;

 b) первую двойную кавычку " - Error:(3, 39) java: unclosed string literal - незамкнутый строковый литерал

 с) вторую двойную кавычку " - Error:(3, 28) java: unclosed string literal - незамкнутый строковый литерал

 d) первую открывающуюся фигурную скобку { - Error:(1, 19) java: '{' expected - ожидается '{'

 e) вторую открывающуюся фигурную скобку { - Error:(5, 1) java: class, interface, or enum expected - ожидается класс, интерфейс или перечисление

 f) первую закрывающуюся фигурную скобку } - Error:(5, 2) java: reached end of file while parsing - достигнут конец файла во время разбора

 g) вторую закрывающуюся фигурную скобку } - Error:(4, 6) java: reached end of file while parsing- достигнут конец файла во время разбора

*/
