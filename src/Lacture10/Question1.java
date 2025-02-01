package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question1 {


    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();


        // get all the male employees
        List<String> list = employeeList.stream().filter(emp -> emp.getGender() == "Male").map(emp -> emp.getName()).collect(Collectors.toList());
        System.out.println(list);


        // 1. How many male and female employees are there in the organization?
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

        // 1.1 =  get map<Male, List<Employee>>
        Map<String, List<Employee>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.toList()));
        System.out.println(collect1);


        // 1.2 = get all male and list of their name, Map<Gender, List<Employee Name>>
        Map<String, List<String>> collect2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect2);


        // 1.3 =  Map<gender, List<Name>>

    }
}
