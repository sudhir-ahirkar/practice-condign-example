package com.FibonacciSeries;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {


    public static void main(String args[]) {
        Integer fibo[] = new Integer[10];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i < fibo.length; i++) {

           int p=fibo[i-1];
            int l=fibo[i-2];
            System.out.println("Fibonacci series==>"+p);
            System.out.println("Fibonacci series==>"+l);

            fibo[i] = fibo[i - 1] + fibo[i - 2];
            System.out.println("Fibonacci series==>"+fibo[i]);
//2+1
        }

        for (int l : fibo) {
            System.out.println("Fibonacci series==>"+l);


        }

    }
}

//0 1 1 2 3 5 8 13 21