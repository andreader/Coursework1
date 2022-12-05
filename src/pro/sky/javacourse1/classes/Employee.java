package pro.sky.javacourse1.classes;

import java.util.Objects;

public class Employee {
    private static int counter = 1;
    private int id;

    private int department;
    private String name;
    private int salary;

    public Employee(String name, int salary, int department) {
        this.id = counter++;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return ("Employee's ID: " +
                getId() + ". " +
                "Name: " +
                getName() + ". " +
                "Salary: " +
                getSalary() + ". " +
                "Department: " +
                getDepartment() + ". ");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(name, employee.name);    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, salary, department);
    }
}
