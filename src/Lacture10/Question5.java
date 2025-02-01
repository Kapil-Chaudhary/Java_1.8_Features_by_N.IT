package Lacture10;

import java.util.List;
import java.util.stream.Collectors;

public class Question5 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 5. Get the names of all employees who have joined after 2015 ?
        List<String> list = employeeList.stream().filter((emp) -> emp.yearOfJoining > 2015).map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(list);

        // just print
        employeeList.stream().filter((emp) -> emp.yearOfJoining > 2015).map(emp -> emp.getName()).forEach(name -> System.out.print(name + " "));

    }
}
