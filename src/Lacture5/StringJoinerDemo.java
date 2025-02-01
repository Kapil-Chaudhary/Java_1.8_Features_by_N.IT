package Lacture5;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("_");
        stringJoiner.add("ashok");
        stringJoiner.add("it");
        stringJoiner.add("java");

        System.out.println(stringJoiner); // ashok_it_java


        StringJoiner stringJoiner2 = new StringJoiner("-", "(", ")"); // 1. delimiter, 2. prefix, 3.suffix
        stringJoiner2.add("ashok");
        stringJoiner2.add("it");
        stringJoiner2.add("java");
        System.out.println(stringJoiner2); // (ashok-it-java)

    }
}
