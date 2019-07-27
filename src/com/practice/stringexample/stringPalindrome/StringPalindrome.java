package com.practice.stringexample.stringPalindrome;

/**
 * Created by sudhir.ahirkar on 11/13/2017.
 */
public class StringPalindrome {

    public static void main(String args[]){
        System.out.print("Runtime.getRuntime()==========>"+Runtime.getRuntime());



        if(isPalindromeString("aba"))
            System.out.print("String is Palindrome");
        else
            System.out.print("String is not Palindrome");
    }

    private static boolean isPalindromeString(String str) {
        if (str == null)
            return false;
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {
            System.out.println("str.charAt(i)====>"+str.charAt(i));
            System.out.println("str.charAt(length - i - 1)====>"+str.charAt(length - i - 1));

            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
}
