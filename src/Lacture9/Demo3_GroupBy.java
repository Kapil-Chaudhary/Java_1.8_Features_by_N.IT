package Lacture9;


import java.util.*;
import java.util.stream.Collectors;


class Employee2 {
    int id;
    String name;
    Double salary;
    String location;

    public Employee2(int id, String name, Double salary, String location) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", location='" + location + '\'' +
                '}';
    }
}

public class Demo3_GroupBy {


    public static void main(String[] args) {

        Employee2 e1 = new Employee2(1, "Robert", 26500.00, "USA");
        Employee2 e2 = new Employee2(2, "Albert", 46500.00, "INDIA");
        Employee2 e3 = new Employee2(3, "Ching", 36500.00, "CHINA");
        Employee2 e4 = new Employee2(4, "David", 16500.00, "INDIA");
        Employee2 e5 = new Employee2(5, "Cathy", 25500.00, "USA");


        ArrayList<Employee2> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));


        Map<String, List<Employee2>> collect = list.stream()
                .collect(Collectors
                        .groupingBy(emp -> emp.location));

        System.out.println(collect);

    }
}
