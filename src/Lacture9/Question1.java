package Lacture9;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Question1 {

    public static void main(String[] args) {


        // convert list into map using java 8

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 1));
        
        Map<Integer, Integer> map = integers.stream().distinct().collect(Collectors.toMap(integers::get, integers::get));
        System.out.println(map);

        Map<Integer, Integer> map2 = integers.stream().distinct().collect(Collectors.toMap(Integer::intValue, Integer::intValue));
        System.out.println(map2);

    }

}
