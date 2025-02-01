package Lacture3;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class a4_ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> c = (name) -> System.out.println(name + " ,Good Evening");
        c.accept("Kapil");
        c.accept("John");
        c.accept("Rani");

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        // for loop
        // while loop
        // for each loop
        // iterator
        // list iterator

        // forEach method will take Consumer Interface as a body
        numbers.forEach(i -> System.out.print(i + " "));


    }
}
