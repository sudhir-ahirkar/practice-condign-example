package com.PallindromString;

import java.util.Scanner;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class Test1 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
       String original= s.nextLine();
        int len=original.length();
        System.out.println("len====>"+len);
       String reverse="";

        for (int i = original.length()-1; i >= 0; i--) {

            reverse=reverse+original.charAt(i);
        }

        System.out.println("Pallindrome===>"+original.equals(reverse));

    }
}
