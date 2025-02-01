package Lacture4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Task5_NumbersSort2  implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if ( o1 > o2 ) return -1;
        else if ( o1 < o2 ) return 1;
        else return 0;
    }

    public static void main(String[] args) {

        //    List<Integer> list = Arrays.asList(1,2,3,4);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        Collections.sort(list, new Task5_NumbersSort2());
        System.out.println("After sort : " + list);
    }
}
