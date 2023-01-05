package com.ArrayAsecndingOrDescending;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {

    public static void main(String args[]) {

        String arr[] = {"Sudhir", "Rakesh", "Godawari", "Arjun"};

        for (String s : arr)
            System.out.println("before sorting==>" + s);
        System.out.println("===========================");
        Arrays.sort(arr);
        for (String s : arr)
            System.out.println("Ascending sorting==>" + s);
        System.out.println("===========================");

        Arrays.sort(arr, Collections.reverseOrder());
        for (String s : arr)
            System.out.println("Descending sorting==>" + s);

        Object b = new Object();

        for (int i = 0; i < arr.length / 2; i++) {
            String tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        System.out.println("Reversed the arr ===>" + Arrays.toString(arr));
        System.out.println("Using two pointer approach ===>");
        String arr1[] = {"Sudhir", "Rakesh", "Godawari", "Arjun"};

        int lhs = 0, rhs = arr1.length - 1;
        // two pointer approach
        while (lhs <= rhs) {
            String temp = arr1[lhs];
            arr1[lhs] = arr1[rhs];
            arr1[rhs] = temp;
            lhs++;
            rhs--;
        }
        System.out.print("Reversed the arr1 ===>" + Arrays.toString(arr1));
    }

}
