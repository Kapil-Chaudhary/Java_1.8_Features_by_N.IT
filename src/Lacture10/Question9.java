package Lacture10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question9 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 9. Who has the most working experience in the organization?
        Optional<Employee> collect = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
        System.out.println(collect.get());

    }
}
