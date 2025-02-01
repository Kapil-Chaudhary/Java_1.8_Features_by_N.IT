package Lacture4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task5_NumbersSort3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Before sort : " + list);

//        Collections.sort(list, (a,b) -> b-a);
//        Collections.sort(list, (i,j) -> j.compareTo(i));
//            Collections.sort(list, (i,j) -> (i>j) ? -1 : (i<j) ? 1 : 0);
        Collections.sort(list, (i,j) -> (i>j) ? -1 : 1);

        System.out.println("After sort 3 : " + list);

    }
}
