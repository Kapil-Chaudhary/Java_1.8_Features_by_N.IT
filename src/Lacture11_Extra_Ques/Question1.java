package Lacture11_Extra_Ques;
import Lacture10.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Question1 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 1. get all the male employees --> List<Employee_Name>
//        List<String> collect1 = employeeList.stream().filter(emp -> emp.getGender() == "Male").map(Employee::getName).collect(Collectors.toList());
//        System.out.println(collect1);

        // 2. How many male and female employees are there in the organization? --> map<gender, count>
//        Map<String, Long> collect2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(collect2);

        // 3. get map<Male, List<Employee>>
//        Map<String, List<Employee>> collect3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));
//        System.out.println(collect3);

        // 4. get all male and list of their name ---> Map<Gender, List<Employee Name>>
//        Map<String, List<String>> collect4 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println(collect4);

        // 5. Print the name of all departments in the organization?
//        List<String> collect5 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
//        System.out.println(collect5);

        // 6. What is the average age of male and female employees?
//        Map<String, Double> collect6 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//        System.out.println(collect6);

        // 7. Get the details of highest paid employee in the organization?
//        employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).ifPresent(System.out::println);

        // 8. Get the names of all employees who have joined after 2015?
//        List<String> collect8 = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).collect(Collectors.mapping(Employee::getName, Collectors.toList()));
//        List<String> collect8 = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).map(employee -> employee.getName()).collect(Collectors.toList());
//        System.out.println(collect8);

        // 9. Count the number of employees in each department?
//        Map<String, Long> collect9 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(collect9);

        // 10. What is the average salary of each department?
//        Map<String, Double> collect10 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
//        System.out.println(collect10);


        // 11.
//        Map<String, List<Employee>> collect11 = employeeList.stream().filter(employee -> employee.getSalary() > 25000.0).collect(Collectors.groupingBy(Employee::getDepartment));
//        System.out.println(collect11);

        Map<String, List<String>> collect11 = employeeList.stream().filter(employee -> employee.getSalary() > 13500.0).collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect11);
    }
}
