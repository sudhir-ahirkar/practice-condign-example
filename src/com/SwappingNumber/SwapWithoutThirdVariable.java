package com.SwappingNumber;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class SwapWithoutThirdVariable {

    public static void main(String args[]){
        int a=10, b=20;
        System.out.println("a==>"+a);
        System.out.println("b==>"+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a==>"+a);
        System.out.println("b==>"+b);

    }
}
