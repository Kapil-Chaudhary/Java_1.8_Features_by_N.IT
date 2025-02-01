package _0Shortcut;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main5_set_array {
    public static void main(String[] args) {

        // 1.convert int[] to set<Integer>
        int[] arr = {1,2,3};
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());


    }
}
