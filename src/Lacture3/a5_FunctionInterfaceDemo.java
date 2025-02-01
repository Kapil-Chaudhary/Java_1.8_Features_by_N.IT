package Lacture3;

import java.util.function.Function;

public class a5_FunctionInterfaceDemo {


    public static void main(String[] args) {
        Function<String, Integer> fi = (name) -> name.length();

        Integer ros = fi.apply("kapil");
        System.out.println(ros);


        System.out.println(fi.apply("akash chaudhary"));
        System.out.println(fi.apply("priyanka"));
    }
}
