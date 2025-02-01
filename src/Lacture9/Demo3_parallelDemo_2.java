package Lacture9;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class Demo3_parallelDemo_2 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("kapil", "Akash", "sachin", "deepak", "mohit");
        Spliterator<String> spliterator = names.stream().spliterator();
        spliterator.forEachRemaining(i -> System.out.println(i));

    }
}
