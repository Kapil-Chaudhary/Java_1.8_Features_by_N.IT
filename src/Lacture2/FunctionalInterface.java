package Lacture2;


// Example for java 8 version

interface MyInterfaceOne{
    public void m1();
}

public class FunctionalInterface implements MyInterfaceOne{
    public void m1(){
        System.out.println("m1 method called...");
    }

    public static void main(String[] args){
        FunctionalInterface functionalInterface = new FunctionalInterface();
        functionalInterface.m1();
    }
}
