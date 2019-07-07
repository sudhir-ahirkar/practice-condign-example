package com.CheckTwoStringCharacterByChar;

import java.util.Arrays;

/**
 * Created by sudhir.ahirkar on 11/19/2017.
 */
public class Test {

    public static void main(String args[]){
        String s="acf";
        String s1="abc";
        checkString(s,s1);
        System.out.println("String are anagram==>"+checkString(s,s1));



    }

    public static boolean checkString(String s,String s1){
       char a[]= s.toCharArray();
        char a1[]= s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(a1);
        return Arrays.equals(a,a1);

    }



}
