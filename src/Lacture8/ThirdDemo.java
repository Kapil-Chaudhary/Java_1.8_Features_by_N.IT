package Lacture8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ThirdDemo {

    public static void main(String[] args) {


        List<String> javaCources = Arrays.asList("core java", "adv java", "spring boot");
        List<String> uiCourses = Arrays.asList("html", "css", "bs", "js");

        List<List<String>> courses = Arrays.asList(javaCources, uiCourses);

        courses.stream().forEach(c -> System.out.println(c));

        Stream<String> fm = courses.stream().flatMap(s -> s.stream());
        fm.forEach(c -> System.out.println(c));
    }
}
