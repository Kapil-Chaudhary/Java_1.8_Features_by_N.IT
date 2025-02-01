package Lacture4;

public class InstanceMethodRefrance {

    public void m1(){
        for ( int i=0; i<5; i++ ) System.out.print(i + " ");
    }


    public static void main(String[] args) {

        InstanceMethodRefrance imr = new InstanceMethodRefrance();

        // so i want to refer my instance method to method refrance by using functional interface,
        // so i use runnable,
        Runnable r = imr::m1; // if we want to refer one method to another method, then we will go for method refrence
        // run method is a static method ( not instance method )

        Thread t = new Thread(r);
        t.start();

    }
}


