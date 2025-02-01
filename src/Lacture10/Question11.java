package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question11 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 11. What is the average salary of male and female employees?
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

    }

}
