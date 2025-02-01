package _0Shortcut;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main7 {
}

class Employee {
    private String name;
    private int age;
    private String department;

    // Constructor, getters, and setters

    public Employee(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", 30, "HR"),
                new Employee("Bob", 40, "Engineering"),
                new Employee("Charlie", 25, "Marketing")
        );


        // map
        // Convert the list into a Map with name as key and Employee object as value
        Map<String, Employee> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getName, employee -> employee));

        // print
        employeeMap.forEach((name, employee) -> System.out.println(name + ": " + employee));

    }
}