package com.PrimeNumberProgram;

/**
 * Created by sudhir.ahirkar on 12/31/2017.
 */
public class Test {

    public static void main(String[] args) {
        int num=2;

        for (int i = 2; i <=100 ; i++) {
            boolean check= PrimeNumber.checkPrimeOrNot(i);

            if(check)
                System.out.print(i + " ");
//                System.out.println(num+" is prime number");
//            else
//                System.out.println(num+" is not prime number");
        }

    }
}
