package Lacture9;


import java.util.*;
import java.util.stream.Collectors;


public class Demo1 {

    public static void main(String[] args) {

        // 1.
        // get min, max and average from the list
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));

        // max
        int max = list.stream().max(Integer::compareTo).get();
        System.out.println("max : " + max);

        // min
        Integer min = list.stream().min(Integer::compare).get();
        System.out.println("min : " + min);

        int i1 = list.stream().mapToInt(i -> i).min().getAsInt();
        System.out.println("min : " + i1);


        // average
        double average = list.stream().mapToDouble(i -> i).average().orElse(0.0);
        System.out.println("average : " + average);

        double asDouble = list.stream().mapToDouble(i -> i).average().getAsDouble();
        System.out.println("average : " + average);
    }
}
