package com.PrimeNumberProgram;

/**
 * Created by sudhir.ahirkar on 12/31/2017.
 */
public class PrimeNumber {

    public static boolean checkPrimeOrNot(int num){


        for (int i = 2; i < num ; i++) {

            if(num%i==0)
                return  false;

        }

        return  true;
    }
}
