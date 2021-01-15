package home_work_19;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person ivan = new Person("Ivan", 18);
        Person clone = ivan.clone();
        clone.setName("Petro");
        System.out.println("Результат работы toSting() " + ivan.toString());
        System.out.println("Результат работы toSting() " + clone.toString());
        System.out.println("Обьект ivan == clone?: " + ivan.equals(clone));

        Person person = null;
        try {
            Class clazz = Class.forName(Person.class.getName());
            Class[] params = {String.class, int.class};
            person = (Person) clazz.getConstructor(params).newInstance("Jhon", 10);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(person);
    }



}

