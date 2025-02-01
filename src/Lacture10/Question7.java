package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question7 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 7. What is the average salary of each department?
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

        // 2. do this with lamda function
        Map<String, Double> collect1 = employeeList.stream().collect(Collectors.groupingBy((emp) -> emp.getDepartment(), Collectors.averagingDouble((emp) -> emp.getSalary())));
        System.out.println(collect1);
    }

}
