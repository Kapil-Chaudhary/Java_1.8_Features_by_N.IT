package Lacture4;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

    // Function Functional Interface
    public static void addition(int val1, int val2){
        BiFunction<Integer,Integer,Integer> bif = (a, b) -> a + b;
        Integer addition = bif.apply(val1, val2);
        System.out.println(addition);

    }


    // 2. other example of Functional Inteferface
    public static void solve2(){
        Function<String,Integer> fi = (name) -> name.length();

    }


    public static void main(String[] args) {
        addition(10, 20);
    }
}
