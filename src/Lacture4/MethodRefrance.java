package Lacture4;

import java.util.function.Consumer;

@FunctionalInterface
interface MyInterface{
    public void m1();
}

// static method refrance example
public class MethodRefrance {

    // consumer simle example
    public static void solve(){
        Consumer<String> consumer = (msg) -> System.out.println(msg);
        consumer.accept("kapil message !!");
    }

    public static void m2(){
        System.out.println("this is m2() method !!");
    }


    public static void main(String[] args) {
        
//        MethodRefrance.m2(); // this is m2() method !!

        MyInterface mi1 = () -> System.out.println("Hi !!");

        // this is method refrence
        MyInterface mi2 = MethodRefrance::m2; // so whenever i want to execute interface method, i want to refer another method

        mi1.m1(); // Hi !!
        mi2.m1(); // this is m2() method !!

    }
}
