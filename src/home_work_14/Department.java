package home_work_14;

import java.util.Arrays;

public class Department {
    private String name;
    private static Employee[] employees = new Employee[0];

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee newEmployee) {
        Employee[] tempArray = Arrays.copyOf(Department.employees, Department.employees.length + 1);
        tempArray[employees.length] = newEmployee;
        employees = tempArray;
        newEmployee.setDepartment(this);
    }

    public void removeEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employee == employees[i]){
                employees[i] = employees[employees.length-1];
                employees[employees.length-1] = null;
                Employee[] tempArray = Arrays.copyOf(Department.employees, Department.employees.length - 1);
                employees = tempArray;
            }
        }
        employee.removeDepartment();
    }

    public static void count() {
        System.out.println("Всего сотрудников в разных департаментах: " + employees.length);
    }
}
