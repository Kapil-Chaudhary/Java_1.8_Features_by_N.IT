package Lacture8;

import java.util.Arrays;
import java.util.List;

class Employee{
    String name;
    int age;
    double salary;

    public Employee() {}

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class SecondDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee("kapil", 24, 5);
        Employee emp2 = new Employee("akash", 22, 7);
        Employee emp3 = new Employee("deepak", 32, 2);
        Employee emp4 = new Employee("shivam", 28, 9);


        // Get emp name with emp age whose salary > 5 using Stream API
        List<Employee> list = Arrays.asList(emp1, emp2, emp3, emp4);

        list.stream().filter(emp -> emp.salary>5 )
                .map( emp -> emp.name +  ", " + emp.age)
                .forEach( emp -> System.out.println(emp));

        // OR
        list.stream().filter(emp -> emp.salary>5 )
                .forEach( emp -> System.out.println(emp.name +  ", " + emp.age));


    }
}
