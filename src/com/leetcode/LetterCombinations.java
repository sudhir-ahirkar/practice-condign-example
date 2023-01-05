package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    static List<String> ans = new ArrayList<>();
    static String[] keyLetter = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
/*    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    Example 2:

    Input: digits = ""
    Output: []
    Example 3:

    Input: digits = "2"
    Output: ["a","b","c"]*/

    public static void main(String[] args) {
       letterCombinations("23");

    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() != 0) backtrack(new StringBuilder(), digits, 0);
        return ans;
    }






/*    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0) backtrack(new StringBuilder(), digits, 0);
        return ans;
    }*/

    public static  void backtrack(StringBuilder temp, String digits, int digitPos)
    {
        if (digitPos == digits.length())
        {
            ans.add(temp.toString());
            return;
        }

        int digit = (digits.charAt(digitPos) - '0') ;
        String letters = keyLetter[digit];

        for (int i=0; i<letters.length(); i++)
        {
            temp.append(letters.charAt(i));
            backtrack(temp, digits, digitPos + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    /*public static List<String> letterCombinations(String digits) {
        Map<Integer,String> map = getMapOfNumAndString();
        for (int i = 0; i < digits.length()-1; i++) {

        }
    }*/

   private static Map<Integer,String> getMapOfNumAndString(){
       Map<Integer,String> map = new HashMap<>();
       map.put(2,"abc");map.put(3,"def");map.put(3,"ghi");map.put(4,"jkl");map.put(5,"mno");map.put(6,"pqr");map.put(6,"tuv");map.put(6,"wxyz");
       return map;
   }


}
