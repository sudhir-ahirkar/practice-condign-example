package leetcode;

import java.util.Arrays;

//151. Reverse Words in a String

/*Given an input string s, reverse the order of the words.

        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

        Return a string of the words in reverse order concatenated by a single space.

        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



        Example 1:

        Input: s = "the sky is blue"
        Output: "blue is sky the"
        Example 2:

        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces.
        Example 3:

        Input: s = "a good   example"
        Output: "example good a"
        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.


        Constraints:

        1 <= s.length <= 104
        s contains English letters (upper-case and lower-case), digits, and spaces ' '.
        There is at least one word in s.*/

public class ReverseWords {

    public static void main(String[] args) {
        String s  = "a good   example";
        String str = reverseWords1(s);
        System.out.println("str===>"+str);
    }

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length/2; i++){
            String temp =  arr[i];
            arr[i] = arr[arr.length-1-i].trim();
            arr[arr.length-1-i] = temp.trim();
        }
        for (String st :arr) {
            if(!st.isEmpty())
            result.append(st).append(" ");
        }
        return  result.toString().trim();
    }


    // Another way
    public static String reverseWords1(String s){
        StringBuilder builder = new StringBuilder();
        String[] arr = s.split(" ");
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            String temp = arr[start].trim();
            arr[start] = arr[end].trim();
            arr[end] = temp;
            start++;
            end--;
        }
        for (String str :arr) {
            builder.append(str).append(" ");
        }
        return builder.toString().trim() ;
    }

}
