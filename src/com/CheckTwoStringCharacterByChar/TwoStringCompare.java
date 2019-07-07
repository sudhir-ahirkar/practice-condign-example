package com.CheckTwoStringCharacterByChar;

import java.util.Arrays;

/**
 * Created by sudhir.ahirkar on 11/19/2017.
 */
public class TwoStringCompare {
    public static void main(String args[]){
        System.out.println(sameChars("abc", "cba"));
    }

    private static boolean sameChars(String firstStr, String secondStr) {
        char[] first = firstStr.toCharArray();
        char[] second = secondStr.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
