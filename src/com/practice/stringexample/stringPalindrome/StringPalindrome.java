package com.practice.stringexample.stringPalindrome;

/**
 * Created by sudhir.ahirkar on 11/13/2017.
 */
public class StringPalindrome {

    public static void main(String args[]){
        System.out.println("Runtime.getRuntime()==========>"+Runtime.getRuntime());

        System.out.println("Runtime.getRuntime() Processor ==========>"+Runtime.getRuntime().availableProcessors());


//        if(isPalindromeString("aba")
        if(isPalindromWithTwoPointer("aba"))
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

    private static boolean isPalindromWithTwoPointer(String str){

        if(str==null){
            return false;
        }
        if(str.length()==1){
            return true;
        }

        int lhs=0;
        int rhs=str.length()-1;

        while(lhs<rhs){
            if(!(str.charAt(lhs)==str.charAt(rhs))){
                return false;
            }
            lhs++;
            rhs--;
        }

        return true;


    }
}
