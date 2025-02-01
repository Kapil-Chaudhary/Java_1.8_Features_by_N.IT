package Lacture10;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Question8 {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();


        // 8. Get the details of youngest male employee in the product development department?
        Optional<Employee> optional = employeeList.stream()
                .filter((emp) -> emp.getGender() == "Male")
                .filter(emp -> emp.getDepartment() == "Development")
                .min(Comparator.comparing(Employee::getAge));
        System.out.println(optional.get());


        // merge 2 filter statement
        Employee employee = employeeList.stream().filter((emp) -> emp.getGender() == "Male" && emp.getDepartment() == "Development").min(Comparator.comparing((emp -> emp.salary))).get();
        System.out.println(employee);

    }

}
