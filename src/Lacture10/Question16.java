package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question16 {

    public static void main(String[] args) {

        List<Employee> employeeList = Employee.getList();

//        Map<String, Employee> collect = employeeList.stream().collect(Collectors.toMap(Employee::getName, employee -> employee));

        Map<String, Double> collect = employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        System.out.println(collect);

    }
}
