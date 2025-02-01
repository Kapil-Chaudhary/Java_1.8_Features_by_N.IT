package Lacture2;

import java.util.function.Predicate;

public class PredicateInterfaceExample4 {

    public static Predicate<String> hasLength10 = new Predicate<String>() {
//        @Override
//        public boolean test(String s) {
//            return false;
//        }
        @Override
        public boolean test(String s) {
            return s.length()>10;
        }
    };


    public static void predicate_or(){
        Predicate<String> containLatterA = p -> p.contains("A");
        String containA = "ABC";

        // or
        boolean ans1 = containLatterA.or(hasLength10).test(containA);
        System.out.println("ans1 : " + ans1);

        // and
        boolean ans2 = containLatterA.and(hasLength10).test(containA);
        System.out.println("ans2 : " + ans2);
    }


    public static void main(String[] args ){
        predicate_or();
    }

}
