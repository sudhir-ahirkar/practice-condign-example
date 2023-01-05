package leetcode;



/*14. Longest Common Prefix
        Easy

        10753

        3445

        Add to List

        Share
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".



        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.


        Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.*/


import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
      String[]  str = {"flower","flow","flight"};
      String logStr = longestCommonPrefix(str);
        System.out.println("Longest Common Prefix ==>"+logStr);

        System.out.println(Arrays.toString(str));

    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length && !prefix.isEmpty(); i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}
