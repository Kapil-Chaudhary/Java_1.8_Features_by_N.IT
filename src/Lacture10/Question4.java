package Lacture10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question4 {


    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();


        // 4. Get the details of highest paid employee in the organization?
        Optional<Employee> collect = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(collect.get());

        // 2
        Optional<Employee> collect1 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble((emp) -> emp.getSalary())));
        System.out.println(collect1.get());

    }

}
