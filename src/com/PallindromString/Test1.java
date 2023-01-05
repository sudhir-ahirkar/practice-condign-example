package com.PallindromString;

import java.util.Scanner;

/**
 * Created by sudhir.ahirkar on 12/12/2017.
 */
public class Test1 {

    public static void main(String[] args) {
        int num = 121;
        int num1 = -121;
        int num2 = 10 ;
        isPalindrome(num2);
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

    public static boolean isPalindrome(int x) {
        boolean isPalindrome =false;;
        int reverseNum = 0;
        int temp = x;
        while(x!=0){
            int current = x%10;
            reverseNum = reverseNum*10+current;
            x=x/10;
        }

        if(reverseNum==temp){
            isPalindrome =true;
        }
        return isPalindrome;
    }
}
