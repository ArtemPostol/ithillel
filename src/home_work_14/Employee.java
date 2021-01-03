package home_work_14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
    String firstName;
    String secondName;
    Date birthday;
    String position;
    Department department;

    public String getFullName() {
        return firstName + " " + secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPosition() {
        return position;
    }

    public String getBirthday() {
        if (birthday == null) {
            return "дата рождения не указана";
        }
        SimpleDateFormat pattern = new SimpleDateFormat("dd-MM-yyyy");
        return pattern.format(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Department getDepartment() {
        return department;
    }

    public Employee(String firstName, String secondName, String position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
    }

    public Employee(String firstName, String secondName, Date birthday, String position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = birthday;
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void removeDepartment() {
        this.department = new Department("не закреплен за отделом (был уволен)");
    }
}
