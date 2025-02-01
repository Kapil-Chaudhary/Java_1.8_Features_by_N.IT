package Lacture8;

import java.util.Arrays;
import java.util.stream.Stream;

public class Questions {


    /*
        int ans = Arrays.stream(sentences)
                        .map(word -> word.split(" "))
                        .map(arr -> arr.length)
                        .max(Integer::compare)
                        .get();
        return ans;
     */


    // leetcode 2114

    // Input : sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
    // Output: 6

    public static int mostWordsFound(String[] sentences) {
        Stream<String[]> streamStr = Arrays.stream(sentences).map(word -> word.split(" "));
//        streamStr.forEach(i -> System.out.print(Arrays.toString(i) + " ")); // [alice, and, bob, love, leetcode] [i, think, so, too] [this, is, great, thanks, very, much]
//        System.out.println();

        Stream<Integer> streamLength = streamStr.map(arr -> arr.length);
//        streamLength.forEach(i -> System.out.print(i + " ")); // 5 4 6

        Integer integer = streamLength.max(Integer::compareTo).get();

        return integer;
    }


    public static void main(String[] args) {
        String[] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = mostWordsFound(sentence);
        System.out.println(ans);
    }

}
