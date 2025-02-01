package Lacture6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondDemo {

    public static void main(String[] args) {


        // 1. print all numbers grater then 20 from the list
        List<Integer> list = Arrays.asList(22, 13, 44, 32, 1, 6);


//        Stream<Integer> stream = list.stream().filter(i -> i > 20);
//        stream.forEach(i -> System.out.print(i + " ")); // 22 44 32

        list.stream().filter( i -> i>20 ).forEach( i -> System.out.print(i + " ")); // 22 44 32

        /*
        Stream<T> filter(Predicate<? super T> predicate)  =
        It returns a stream consisting of the elements of this stream that match the given predicate.

        predicate interface will take input ( and do if else operation on it ) and return boolean value as output

         */



        // 2. print names that start with 'A'
        List<String> list1 = Arrays.asList("john", "Anushka", "Robert", "Anupama", "Smith", "Ashoka");
        list1.stream().filter(i -> i.startsWith("A") || i.startsWith("a") ).forEach( i -> System.out.print(i + " ")); // Anushka Anupama Ashoka



        // 3. filter the object
        // filter the user whose age is grater the or equal to 18
        User u1 = new User("John", 25);
        User u2 = new User("Smith", 30);
        User u3 = new User("Raju", 15);
        User u4 = new User("Rani", 10);
        User u5 = new User("Charles", 35);
        User u6 = new User("Ashok", 30);

        System.out.println();
        Stream.of(u1, u2, u3, u4, u5, u6).filter( user -> user.age >= 18 ).forEach(user -> System.out.print(user.name + " ")); // John Smith Charles Ashok

        System.out.println();
        Stream.of(u1, u2, u3, u4, u5, u6)
                .filter(user -> user.age >= 18 && user.name.startsWith("A") || user.name.startsWith("a"))
                .forEach(user -> System.out.println(user)); // User{name='Ashok', age=30}


        // or 2 filter
        System.out.println();
        Stream.of(u1, u2, u3, u4, u5, u6)
                .filter(user -> user.age >= 18)
                .filter(user -> user.name.startsWith("A") || user.name.startsWith("a") )
                .forEach(user -> System.out.println(user)); // User{name='Ashok', age=30}

    }
}

class User{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
