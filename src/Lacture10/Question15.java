package Lacture10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question15 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();

        // 15. Who is the oldest employee in the organization? What is his age and which department he belongs to ?
        Optional<Employee> optionalEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getYearOfJoining)));

        System.out.println("Department : " + optionalEmployee.get().department);
        System.out.println("Age : " + optionalEmployee.get().age);
    }
}
