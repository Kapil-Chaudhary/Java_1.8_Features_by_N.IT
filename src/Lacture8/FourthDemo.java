package Lacture8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FourthDemo {

    public static void main(String[] args) {

        List<String> javacourses = Arrays.asList("corejava", "advJava", "springBoot", "restAPI", "microservices", "corejava");

        // 1
        Stream<String> stream = javacourses.stream().limit(3);
        stream.forEach(i -> System.out.print(i + " "));
        System.out.println();

        // OR
        javacourses.stream().limit(3).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 2
        javacourses.stream().distinct().forEach(i -> System.out.print(i + " "));
        System.out.println();

        // 3
        javacourses.stream().skip(3).forEach(i -> System.out.print(i + " "));
    }
}
