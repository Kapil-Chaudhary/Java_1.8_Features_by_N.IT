package _0Shortcut;

import java.util.Arrays;

public class Main3_string_and_array {
    public static void main(String[] args) {

        // 1. convert String into String[] array
        String str = "123";
        String[] strArr = str.split("");

        // 2. convert String[] into int[]
        int[] ints = Arrays.stream(strArr).mapToInt(Integer::parseInt).toArray();
        int[] ints1 = Arrays.stream(strArr).mapToInt(i -> Integer.parseInt(i)).toArray();


    }
}
