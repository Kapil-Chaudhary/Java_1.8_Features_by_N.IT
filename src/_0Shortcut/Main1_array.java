package _0Shortcut;

import java.util.Arrays;
import java.util.Comparator;

public class Main1_array {

    public static void main(String[] args) {

        // 1. convert int[] to Integer[]
        int[] arr = {1,2,3};
        Integer[] array = Arrays.stream(arr).boxed().toArray(Integer[]::new);


        // 2. convert Integer[] to int[] array
        Integer[] array2 = {1,2,3};
        int[] ints = Arrays.stream(array2).mapToInt(i -> i).toArray();


        // 3. reverse the array of integer
        int[] arr3 = {1,2,3};
        Integer[] array1 = Arrays.stream(arr3).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        int[] ints1 = Arrays.stream(arr3).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

    }
}
