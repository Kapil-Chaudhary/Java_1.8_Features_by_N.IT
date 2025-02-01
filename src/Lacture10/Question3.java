package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question3 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();


        // 3. What is the average age of male and female employees?
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect);
    }
}
