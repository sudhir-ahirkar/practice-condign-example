package com.CheckTwoStringCharacterByChar;

import java.util.Arrays;

/**
 * Created by sudhir.ahirkar on 11/19/2017.
 */
public class Test {

    public static void main(String args[]){
        String s="abc";
        String s1="abc";
        checkString(s,s1);
        System.out.println("String are anagram==>"+checkString(s,s1));



    }

    public static boolean checkString(String s,String s1){
        for (int i = 0; i < s.length()/2; i++) {
            if(!(s.charAt(i)==s1.charAt(i) && s.charAt(s.length()-1-i)==s1.charAt(s.length()-1-i))){
                return false;
            }
        }
        return true;

       /* for (int i = 0; i < s.length()/2; i++) {
            if(s.contains(s1.charAt(i)) && s.contains(s1.charAt(s.length()-1-i))){

            }
        }*/

/*        char a[]= s.toCharArray();
        char a1[]= s1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(a1);
        return Arrays.equals(a,a1);*/
    }



}
