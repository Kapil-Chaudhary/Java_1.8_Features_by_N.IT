package Lacture4;


import java.util.*;
import java.util.stream.Collector;


class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if ( o1 > o2 ) return -1;
        else if ( o1 < o2 ) return 1;
        else return 0;
    }

}
public class Task5_NumbersSort {


    public static void main(String[] args) {
        //    List<Integer> list = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collections.sort(list, new MyComparator());
        System.out.println("After sort : " + list);
    }
}
