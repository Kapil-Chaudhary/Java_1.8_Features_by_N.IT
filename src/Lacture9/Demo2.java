package Lacture9;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    int id;
    String name;
    Double salary;

    public Employee(int id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Demo2 {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Robert", 26500.00);
        Employee e2 = new Employee(2, "Albert", 46500.00);
        Employee e3 = new Employee(3, "Ching", 36500.00);
        Employee e4 = new Employee(4, "David", 16500.00);
        Employee e5 = new Employee(5, "Cathy", 25500.00);


        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        // max salary from employees
        Stream<Employee> stream = Stream.of(e1, e2, e3, e4, e5);
        Optional<Employee> optional = stream.collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
        Employee maxSalary = optional.get();
        System.out.println("Max Salary : " + maxSalary.salary);

        System.out.println("\n");




        // min salary from employees
        Employee min_emp = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary))).get();
        System.out.println("Min Salary : " + min_emp.salary);

        Double minSalary_2 = list.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary))).get().salary;
        System.out.println("Min Salary 2 : " + minSalary_2);

        Stream<Double> doubleStream = list.stream().map(emp -> emp.salary);
        int asInt = doubleStream.mapToInt(i -> i.intValue()).min().getAsInt();
        System.out.println("min Salary 3 : " + asInt);


        int asInt2 = list.stream().mapToInt(i -> i.salary.intValue()).min().getAsInt();
        System.out.println("min salary 4 : " + asInt2);

        System.out.println("\n");








        // find average
        Double average = list.stream().collect(Collectors.averagingDouble(e -> e.salary));
        System.out.println("Average salary : " + average);

        double averageSalary_2 = list.stream().mapToDouble(emp -> emp.salary).average().getAsDouble();
        System.out.println("Average salary 2 : " + averageSalary_2);
    }


}
