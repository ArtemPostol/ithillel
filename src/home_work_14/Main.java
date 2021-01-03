package home_work_14;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department programmersDepartment = new Department("Программисты");
        Department financeDepartment = new Department("Финансисты");
        Department householdsDepartment = new Department("Хозяйственный департамент");

        Employee phpDeveloper = new Employee("Андрей", "Бондарь", "Програмист");
        Employee javaDeveloper = new Employee("Николай", "Андреев", "Програмист");
        Employee qa = new Employee("Николай", "Николаев", "Тестировщик");
        programmersDepartment.addEmployee(phpDeveloper);
        programmersDepartment.addEmployee(javaDeveloper);
        programmersDepartment.addEmployee(qa);

        Employee economist1 = new Employee("Инна", "Петрова", "Бухгалтер");
        Employee economist2 = new Employee("Анна", "Галушко", new Date(654037200000L),"Финансист");
        Employee economist3 = new Employee("Ольга", "Герасименко", "Главный бухгалтер");
        Employee economist4 = new Employee("Альберт", "Гусев", "Бухгалтер");
        financeDepartment.addEmployee(economist1);
        financeDepartment.addEmployee(economist2);
        financeDepartment.addEmployee(economist3);
        financeDepartment.addEmployee(economist4);

        Employee handyman1 = new Employee("Сергей", "Жданов", new Date(603925200000L),"Дворник");
        Employee handyman2 = new Employee("Анна", "Лягушова", "Завхоз");
        Employee handyman3 = new Employee("Иван", "Исипов", "Дворник");

        System.out.println(handyman1.getBirthday());

        householdsDepartment.addEmployee(handyman1);
        householdsDepartment.addEmployee(handyman2);
        householdsDepartment.addEmployee(handyman3);

        financeDepartment.removeEmployee(economist2);
        financeDepartment.removeEmployee(handyman2);

        System.out.println("Сотрудник: " + phpDeveloper.getFullName() + " занимает позицию: " + phpDeveloper.getPosition() + ", относится к отделу: " + phpDeveloper.getDepartment().getName() + ", родился: " + phpDeveloper.getBirthday());
        System.out.println("Сотрудник: " + javaDeveloper.getFullName() + " занимает позицию: " + javaDeveloper.getPosition() + ", относится к отделу: " + javaDeveloper.getDepartment().getName() + ", родился: " + phpDeveloper.getBirthday());
        System.out.println("Сотрудник: " + qa.getFullName() + " занимает позицию: " + qa.getPosition() + ", относится к отделу: " + qa.getDepartment().getName() + ", родился: " + phpDeveloper.getBirthday());
        System.out.println("Сотрудник: " + economist1.getFullName() + " занимает позицию: " + economist1.getPosition() + ", относится к отделу: " + economist1.getDepartment().getName() + ", родился: " + economist1.getBirthday());
        System.out.println("Сотрудник: " + economist2.getFullName() + " занимает позицию: " + economist2.getPosition() + ", относится к отделу: " + economist2.getDepartment().getName() + ", родился: " + economist2.getBirthday());
        System.out.println("Сотрудник: " + economist3.getFullName() + " занимает позицию: " + economist3.getPosition() + ", относится к отделу: " + economist3.getDepartment().getName() + ", родился: " + economist3.getBirthday());
        System.out.println("Сотрудник: " + economist4.getFullName() + " занимает позицию: " + economist4.getPosition() + ", относится к отделу: " + economist4.getDepartment().getName() + ", родился: " + economist4.getBirthday());
        System.out.println("Сотрудник: " + handyman1.getFullName() + " занимает позицию: " + handyman1.getPosition() + ", относится к отделу: " + handyman1.getDepartment().getName() + ", родился: " + handyman1.getBirthday());
        System.out.println("Сотрудник: " + handyman2.getFullName() + " занимает позицию: " + handyman2.getPosition() + ", относится к отделу: " + handyman2.getDepartment().getName() + ", родился: " + handyman2.getBirthday());
        System.out.println("Сотрудник: " + handyman3.getFullName() + " занимает позицию: " + handyman3.getPosition() + ", относится к отделу: " + handyman3.getDepartment().getName() + ", родился: " + handyman3.getBirthday());
        Department.count();
    }
}
