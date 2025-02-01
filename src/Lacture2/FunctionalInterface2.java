package Lacture2;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterfaceTwo{
    public void m2();
}

public class FunctionalInterface2 {
    public static void main(String[] args){
        MyInterfaceTwo mit = () -> System.out.println("m2 method called...");
        mit.m2();

    }
}
