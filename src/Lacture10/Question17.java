package Lacture10;


import java.util.List;
import java.util.stream.Collectors;

class Employee1 {
    int empId;
    int managerId;

    public Employee1(int empId, int managerId) {
        this.empId = empId;
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId=" + empId +
                ", managerId=" + managerId +
                '}';
    }
}

public class Question17 {

    public static void main(String[] args) {

        Employee1 e1 = new Employee1(1,100);
        Employee1 e2 = new Employee1(2,100);
        Employee1 e3 = new Employee1(3,100);
        Employee1 e4 = new Employee1(4,200);
        Employee1 e5 = new Employee1(5,200);

        List<Employee1> employee1s = List.of(e1, e2, e3, e4, e5);

        // find all employees whose manager id is 100
        List<Employee1> collect = employee1s.stream().filter(e -> e.managerId == 100).collect(Collectors.toList());
        System.out.println(collect);

    }

}
