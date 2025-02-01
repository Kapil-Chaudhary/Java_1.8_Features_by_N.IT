package Lacture4;

// Approach - 3

public class Task4_ThreadDemo3 {
    public static void main(String[] args) {

        Runnable r  = () -> {
            for (int i = 1; i <= 5; i++) System.out.print(i + " ");
        };

        Thread t = new Thread(r);
        t.start();

    }
}
