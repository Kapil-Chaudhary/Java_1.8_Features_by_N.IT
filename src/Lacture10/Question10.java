package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question10 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 10. How many male and female employees are there in the sales and marketing team?
        Map<String, Long> collect = employeeList.stream().filter(employee -> employee.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(collect);

    }
}
