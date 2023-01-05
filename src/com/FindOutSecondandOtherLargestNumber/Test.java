package com.FindOutSecondandOtherLargestNumber;


import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {

  static   Integer arr[]={1,3,6,8,19,56,89,34};

    public static void main(String args[]){
        Arrays.sort(arr);
        System.out.println("sorted array==>"+Arrays.toString(arr));

        System.out.println("First largest number of array==>"+arr[arr.length-1]);
        System.out.println("Second largest number of array==>"+arr[arr.length-2]);
        System.out.println("First lowest number of array==>"+arr[0]);

        Integer third_largest = Stream.of(arr).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println("third_largest===>"+third_largest);
        Integer four_largest = Stream.of(arr).sorted(Comparator.reverseOrder()).skip(3).findFirst().get();
        System.out.println("four_largest===>"+four_largest);
        Integer secon_largest = Stream.of(arr).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secon_largest===>"+secon_largest);


    }


}
