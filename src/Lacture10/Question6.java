package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question6 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 6. Count the number of employees in each department?
        Map<String, Long> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(collect);


        // map<departName, List<employeeName>>
        Map<String, List<String>> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect1);
    }
}
