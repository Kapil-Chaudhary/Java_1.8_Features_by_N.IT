package Lacture9;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee3 {
    int id;
    String name;
    Double salary;

    public Employee3(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Question2 {

    // convert list of objects into map using java 8

    public static void main(String[] args) {
        Employee3 e1 = new Employee3(1, "Robert", 26500.00);
        Employee3 e2 = new Employee3(2, "Albert", 46500.00);
        Employee3 e3 = new Employee3(3, "Ching", 36500.00);
        Employee3 e4 = new Employee3(4, "David", 16500.00);
        Employee3 e5 = new Employee3(5, "Cathy", 25500.00);

        ArrayList<Employee3> employees = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

//        employees.stream().collect(Collectors.toMap(employees::get))

    }





}
