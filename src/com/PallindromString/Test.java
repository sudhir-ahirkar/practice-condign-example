package com.PallindromString;

import java.util.Scanner;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {


    public static void main(String args[]) {

        Scanner scanner=new Scanner(System.in);

      String original=  scanner.nextLine();

        StringBuilder stringBuilder=new StringBuilder(original);
        stringBuilder=stringBuilder.reverse();

        System.out.println("original===>"+original);
        System.out.println("stringBuilder===>"+stringBuilder);

String s=new String(stringBuilder);
        if(original.equals(s))
            System.out.println("Pallindrom");
       else

        System.out.println("Not Pallindrom");



    }
}
