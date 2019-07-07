package com.MisssingNumberInArray;

import java.util.Arrays;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class MissingNumber {

    static Integer ars[]={1,5,6,7,9,2,3,4};

    public static void main(String args[]){

        Arrays.sort(ars);

        int size=ars.length+1;


        int missingNum=getMissingArray(ars,size);


        System.out.println("missingNum===>"+missingNum);


    }


    public static  int getMissingArray(Integer a[], int n){

        int actual=0;
        int expectedTotal=n*(n+1)/2;

        for (int num: a){

            actual=actual+num;
        }

        return expectedTotal-actual;
    }
}
