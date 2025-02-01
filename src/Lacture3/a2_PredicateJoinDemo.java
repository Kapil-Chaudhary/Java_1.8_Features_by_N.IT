package Lacture3;


import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

class Employee{
    String name;
    String location;
    String dept;

    Employee(String name, String location, String dept){
        this.name = name;
        this.location = location;
        this.dept = dept;
    }

}

public class a2_PredicateJoinDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee("Raju", "channai", "devops");
        Employee e2 = new Employee("Rani", "Pune", "Networking");
        Employee e3 = new Employee("Ashok", "HYD", "DB");
        Employee e4 = new Employee("Genesh", "delhi", "testing");
        Employee e5 = new Employee("kapil", "HYD", "testing");

        List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

        Predicate<Employee> p1 = e -> e.location.equals("HYD");
        Predicate<Employee> p2 = e -> e.dept.equals("DB");
        Predicate<Employee> p3 = e -> e.name.equals("kapil");

        // predicate joining
        Predicate<Employee> p = p1.and(p2); // ashok
        Predicate<Employee> pp = p1.or(p2); // ashok
        Predicate<Employee> ppp = p1.or(p2).and(p3); // kapil

        for ( Employee e : employees ){
//            if ( p.test(e) ) System.out.println(e.name);
            if ( pp.test(e) ) System.out.println(e.name);
        }


        System.out.println("==========================================");
        BiPredicate<Integer, Integer> biPredicate = (i,j) -> (i+j)==20;
        System.out.println(biPredicate.test(10,10));

    }
}
