package Lacture8;

import java.util.Arrays;
import java.util.List;

public class FirstDemo {

    public static void main(String[] args) {


        // 1
        // convert all the elements to uppercase character
//        List<String> list = Arrays.asList("india", "usa", "uk", "japan");

        // 1. method1  -- legacy method
//        for ( String str : list ) System.out.print(str.toUpperCase() + " ");
//        System.out.println();


        // 2. method2
//        list.stream().map(i-> i.toUpperCase() ).forEach( j -> System.out.print(j + " "));
//        System.out.println();
//        // or
//        List<String> list1 = list.stream().map(i -> i.toUpperCase()).toList();
//        System.out.println(list1);



        // 2.
        // find the length of each name in list
//        List<String> list = Arrays.asList("india", "usa", "uk", "japan");
//        list.stream().map( name -> name.length() ).forEach(i -> System.out.print(i + " ") ); // 5 3 2 5
//        System.out.println();



        // 3.
        // print names with its length starting with latter 'A'
//        List<String> list = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
//        list.stream()
//                .filter(name -> name.startsWith("A") ) // we can use map here as well so instead of filtering the names it will get all these names that start with 'A'
//                .map(name -> name + " - " + name.length() )
//                .forEach(name -> System.out.println(name));







        // convert int[] to Integer[] value in Array
        int[] arr = {1,2,3};
//        Arrays.stream(arr).mapTo


    }

}
