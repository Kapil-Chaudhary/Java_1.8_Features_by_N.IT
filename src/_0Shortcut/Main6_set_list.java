package _0Shortcut;

import java.util.*;
import java.util.stream.Collectors;

public class Main6_set_list {

    public static void main(String[] args) {

        // 1. convert int[] to set<Integer>
        int[] arr = {1,3,2,1,1,2};
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        // 1. convert List<Integer> to set<Integer>
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,2,2,1,1,2));
        HashSet<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }

}
