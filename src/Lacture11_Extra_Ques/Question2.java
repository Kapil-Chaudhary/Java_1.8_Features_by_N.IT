package Lacture11_Extra_Ques;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getList();


        // collect the data in the format Emp<deptName, List<emp_names>> but salary of all the emp is grater then 13500.0
        Map<String, List<String>> collect = employeeList.stream()
                        .filter(employee -> employee.salary > 13500.0)
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(collect);

    }
}