package com.FibonacciSeries;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class TestFibo {

    public static void main(String[] args) {

        Integer[] arr=new Integer[10];

        arr[0]=0;
        arr[1]=1;

        for (int i = 2; i < arr.length; i++) {

            arr[i]=arr[i-1]+arr[i-2];

        }

        for(int i: arr)
            System.out.println(i);



    }
}
