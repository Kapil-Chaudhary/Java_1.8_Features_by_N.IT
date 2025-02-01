package Lacture10;

import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // Print the name of all departments in the organization?
        Set<String> departments = employeeList.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet());
        System.out.println(departments);

        // 2. print name directely
        employeeList.stream().map(emp -> emp.getDepartment()).collect(Collectors.toSet()).forEach(name -> System.out.print(name + " "));
        System.out.println();

        // 3
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(name -> System.out.print(name + " "));

    }
}
