package leetcode;


/*The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

        For example, "ACGAATTCCG" is a DNA sequence.
        When studying DNA, it is useful to identify repeated sequences within the DNA.
        Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than
        once in a DNA molecule. You may return the answer in any order.

        Example 1:
        Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
        Output: ["AAAAACCCCC","CCCCCAAAAA"]
        Example 2:

        Input: s = "AAAAAAAAAAAAA"
        Output: ["AAAAAAAAAA"]

        Constraints:

        1 <= s.length <= 105
        s[i] is either 'A', 'C', 'G', or 'T'*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatedDnaSequences {

    public static void main(String[] args) {
        String str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> lst = findRepeatedDnaSequences(str);
        System.out.println("lst=====>"+lst);
    }

    // HashMap Way
    private static List<String> findRepeatedDnaSequences(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() - 10; i++) {
            String subStr = str.substring(i, i+10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
        }
        List<String> lst = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                lst.add(entry.getKey());
            }
        }
        return lst;
    }
}
