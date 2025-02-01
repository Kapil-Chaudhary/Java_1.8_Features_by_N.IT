package Lacture9;

import java.util.stream.Stream;

public class Demo3_parallelDemo {

    public static void main(String[] args) {

        System.out.println("------------------------------- serial stream ");
        Stream<Integer> serial_stream = Stream.of(1, 2, 3, 4);
        serial_stream.forEach(i -> System.out.println(i + " :: " + Thread.currentThread()));

            /* so main theread is printing our data
    /                                      so whenever we run a java program so by-default JVM will create one thread to run our java program
    /                                      so default thread is called main thread, so our stream is created by main thread and our stream is processed by main thread
    */

    /*
        output ===>
        ------------------------------- serial stream
        1 :: Thread[main,5,main]
        2 :: Thread[main,5,main]
        3 :: Thread[main,5,main]
        4 :: Thread[main,5,main]

     */


        System.out.println("-----------------------------------------   Parallel Stream --------");
        Stream<Integer> parellelStream = Stream.of(1, 2, 3, 4);
        parellelStream.parallel().forEach( i -> System.out.println(i + " :: " + Thread.currentThread()));


        /*

        -----------------------------------------   Parallel Stream --------
            3 :: Thread[main,5,main]
            4 :: Thread[main,5,main]
            1 :: Thread[main,5,main]
            2 :: Thread[ForkJoinPool.commonPool-worker-1,5,main]

         */


    }
}
