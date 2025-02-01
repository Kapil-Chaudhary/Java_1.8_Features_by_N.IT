package Lacture6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FirstDemo {

    public static void main(String[] args) {

        // approch 1 : to create a stream object
        // 1. create stream by stream.of(..) method
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(stream); // java.util.stream.ReferencePipeline$Head@65ab7765


        // // approch 2 : to create a stream object
        // 2. create stream by stream method
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Stream<Integer> stream1 = list.stream();
        System.out.println(stream1); // java.util.stream.ReferencePipeline$Head@1b28cdfa

    }
}
