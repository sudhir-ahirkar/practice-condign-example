package com.FibonacciSeries;

import java.util.Scanner;

/**
 * Created by sudhir.ahirkar on 12/7/2017.
 */
public class FibonacciSeries {

    public static void main(String args[]){

        Scanner s =new Scanner(System.in);
        int number= s.nextInt();

        Integer fiboArray[]=new Integer[number];

        fiboArray[0]=0;
        fiboArray[1]=1;

        for (int i = 2; i < fiboArray.length; i++) {

            fiboArray[i]=fiboArray[i]-fiboArray[0];

        }
    }
}
