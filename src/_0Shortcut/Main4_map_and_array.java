package _0Shortcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class Main4_map_and_array {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");


        // 1. convert map of keys to array
        Integer[] array = map.keySet().stream().sorted().toArray(Integer[]::new); // [1, 2, 3]
        int[] ints = map.keySet().stream().mapToInt(i -> i).toArray(); // [2, 1, 3]

        // 2. convert string of values into array
        Collection<String> values = map.values();
        String[] array1 = map.values().stream().toArray(String[]::new);

    }

}
