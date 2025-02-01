package Lacture10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Question18 {
    public static void main(String[] args) {

        // 1. approach 1:
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Integer collect = list.stream()
                            .filter(i -> i % 2 == 0) // 2 + 4 + 6 + 8
                            .map(i -> i / 2) // 1 + 2 + 3 + 4
                .collect(Collectors.summingInt(Integer::intValue)); // 10
        System.out.println(collect);


        // 2. approach 2:
        int sum = list.stream().filter(i -> i % 2 == 0).map(i -> i / 2).mapToInt(i->i).sum();
        System.out.println(sum);



    }
}


/*

 Given List<Integer> list = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9):
 -> Filter out all even numbers.
 -> Divide all filtered numbers by 2.
 -> Print the sum.

 */
