package Lacture4;

// Approach 2

// 1. here, instead of implementing a interface, i'm going for anonymous implementation
public class Task4_ThreadDemo2 {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for ( int i=1; i<=5; i++ ) System.out.print(i + " ");
            }
        };


        Thread t = new Thread(r);
        t.start();

    }
}
