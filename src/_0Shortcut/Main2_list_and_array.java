package _0Shortcut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main2_list_and_array {

    public static void main(String[] args) {

        // 1. convert int[] to list<int>
        int[] arr = {1,2,3};
        List<int[]> list = Arrays.asList(arr);

        // 2. convert Integer[] to List<Integer>
        int[] arr2 = {1,2,3};
        Integer[] array = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        List<Integer> list5 = Arrays.stream(array).toList();
        List<Integer> list1 = Arrays.asList(array);

        // 3. List<Integer> to int[]
        List<Integer> list2 = Arrays.asList(1,2,3);
        ArrayList<Integer> list3 = new ArrayList<>(list1);

        int[] ints = list1.stream().mapToInt(Integer::intValue).toArray();
        int[] ints1 = list3.stream().mapToInt(i -> i).toArray();


        // 4. convert int[] to List<Integer>
        int[] arr3 = {1,2,3 };
        List<Integer> list4 = Arrays.stream(arr3).boxed().toList();
        List<Integer> list6 = Arrays.stream(arr3).boxed().collect(Collectors.toList());

    }
}
