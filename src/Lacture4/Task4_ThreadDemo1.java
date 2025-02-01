package Lacture4;


// Approch 1

// 1. overrideing the run method by implementing the Runnable interface
// 2. now create the object of my class
// 3. and now my onject is passing as a parameter to thread class
// 4. now calling t.start() --> so whenever i call t.start() thread schedule will start, thread schedule will allocate the resource the to thread and it is going to execute the thread.

public class Task4_ThreadDemo1 implements Runnable{

    @Override
    public void run() {
        for ( int i=1; i<=5; i++ ) System.out.print(i + " ");
    }


    public static void main(String[] args) {
        Task4_ThreadDemo1 td = new Task4_ThreadDemo1();
        Thread t = new Thread(td);
        t.start();
    }

}