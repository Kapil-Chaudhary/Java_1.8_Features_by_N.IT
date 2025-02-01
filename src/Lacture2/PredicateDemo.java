package Lacture2;

import java.util.function.Predicate;

public class PredicateDemo {

    //// method without lambda
//    public boolean test(int i){
//        if ( i>10 ) return true;
//        else return false;
//    }


    // 4
    public static void pred(int num, Predicate<Integer> predicate) {
        if (predicate.test(num)) System.out.println("Number : " + num);
        else System.out.println("-1");
    }

    public static void main(String[] args) {


// 1.
        Predicate<Integer> p = (i) -> i > 10;
        System.out.println(p.test(5)); // test


//  2.  Declare names in the array and print names which are starting with "A" using lambda expression.
        String[] names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny"};
        Predicate<String> p1 = name -> name.charAt(0) == 'A';
        for (String name : names) {
            if (p1.test(name)) System.out.println(name);
        }
    }


// 3.   Java program to illustrate Predicate Chaining
//        Predicate<Integer> graterThenTen = i -> i > 10;
//        Predicate<Integer> lowerThanTwenty = i -> i < 20;

//        // check
//        boolean ans1 = graterThenTen.and(lowerThanTwenty).test(15); // true
//        System.out.println("ans1 : " + ans1);
//
//        boolean ans2 = graterThenTen.and(lowerThanTwenty).test(5); // false
//        System.out.println("ans2 : " + ans2);



// 4.  Java program to illustrate passing Predicate into function
//        pred(15, i -> i > 10);


// 5. Java program to illustrate OR Predicate
//          PredicateInterfaceExample4 -- check class


// 6.
// Java program to demonstrate working of predicates
// on collection. The program finds all admins in an
// arrayList of users.

    //  User  -- check class as an example


// 7.

}
