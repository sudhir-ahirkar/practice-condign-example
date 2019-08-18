package com.FactorialOfNumber;

import java.math.BigInteger;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {

    public static void main(String args[]) {
///It is good for small number
        int num=4;
         int factorial=1;
        for (int i = 1; i <= num; i++) {
          factorial=factorial*i;

        }
        System.out.println("factorial==>"+factorial);

//for large number

        int bigNum=20;
        BigInteger bigInteger=BigInteger.ONE;
        for (int i = 1; i <= bigNum; i++) {
            bigInteger=bigInteger.multiply(BigInteger.valueOf(i));

        }
        System.out.println("bigInteger==>"+bigInteger);

    }
}
