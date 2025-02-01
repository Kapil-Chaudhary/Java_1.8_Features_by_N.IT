package Lacture3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


// question --> print all the person whose age is grater then 25
public class a1_Person {
    String name;
    int age;
    a1_Person(String n, int a){
        this.name = n;
        this.age= a;
    }


    public static void main(String[] args) {

        a1_Person a1 = new a1_Person("kapil", 24);
        a1_Person a2 = new a1_Person("akash", 20);
        a1_Person a3 = new a1_Person("priyanka", 22);
        a1_Person a4 = new a1_Person("ram", 30);

//        ArrayList<a1_Person> list = new ArrayList<>(Arrays.asList(a1, a2, a3, a4));
//        ArrayList<a1_Person> list = (ArrayList<a1_Person>) Arrays.asList(a1, a2, a3, a4);
        List<a1_Person> list = Arrays.asList(a1, a2, a3, a4);
        Predicate<a1_Person> p1 = (person) -> person.age > 25;
        for ( a1_Person person : list ) {
            if ( p1.test(person) ) System.out.println(person.age);
        }

    }
}
