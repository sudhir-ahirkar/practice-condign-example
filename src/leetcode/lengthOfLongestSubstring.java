package leetcode;

import java.util.*;

public class lengthOfLongestSubstring {

   /* Given a string s, find the length of the longest substring without repeating characters


    Example 1:

    Input: s = "abcabcbefghb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.

    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.

    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/

    public static void main(String[] args) {
//        String s = "abcabcbb";
//        String s = "bbbbb";
//          String s = "pwwkew";
        String s1 = "abcabcbefghb";
//        String s ="aab";
//        int lenght = lengthOfLongestSubstring2(s1);
        int lenght = my_lengthOfLongestSubstring(s1);
    }

    public static int lengthOfLongestSubstring2(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        String longestSubStr = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                max = Math.max(map.size(), max);
                longestSubStr = map.keySet().toString();
                i = map.get(c);
                map.clear();
            }
        }
        System.out.println("max====>" + max);
        System.out.println("longestSubStr===>" + longestSubStr);
        return max;
    }

    private static int my_lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        int longestSubstringLenght = 0;
        String longestString = null;
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (!map.containsKey(c)) {
                map.put(c, i);
            } else {
                i = map.get(c); //very important
                map.clear();
            }
//            longestSubstringLenght = Math.max(map.size(),longestSubstringLenght);
            if (map.size() > longestSubstringLenght) {
                longestSubstringLenght = map.size();
                longestString = map.keySet().toString();
            }
        }
        System.out.println("Longest Substring :" + longestString);
        System.out.println("Longest Substring Lenght :" + longestSubstringLenght);
        return longestSubstringLenght;
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, length = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                if (start <= map.get(c))
                    start = map.get(c) + 1;
            }
            length = Math.max(length, end - start + 1);
            map.put(c, end);
        }
        return length;
    }

}
