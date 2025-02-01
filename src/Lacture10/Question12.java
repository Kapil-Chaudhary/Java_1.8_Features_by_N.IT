package Lacture10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question12 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 12. List down the names of all employees in each department?
        Map<String, List<String>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect);

    }

}
