package leetcode;


//387. First Unique Character in a String

/*Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



        Example 1:

        Input: s = "leetcode"
        Output: 0
        Example 2:

        Input: s = "loveleetcode"
        Output: 2
        Example 3:

        Input: s = "aabb"
        Output: -1


        Constraints:

        1 <= s.length <= 105
        s consists of only lowercase English letters.*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class  FirstUniqChar {
    public static void main(String[] args) {
//        String str = "leetcode";
        String str = "loleleetcode";
        int firstNotRepeatingCharIndex =  getFirstUniqueCharIndex(str);
        System.out.println("firstNotRepeatingCharIndex====>"+firstNotRepeatingCharIndex);

        /// if index requires then Map only help us
        int firstNotRepeatingCharIndexUsingJava8 =  getFirstUniqueCharIndex1(str);
        System.out.println("firstNotRepeatingCharIndexUsingJava8====>"+firstNotRepeatingCharIndexUsingJava8);
    }

    // Using Java 8
    /// our requirement can't fullfill using below approach as index needed
    static int getFirstUniqueCharIndex1(String str) {

//        Map<Character, Long> collect = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> linkedHashMap = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        System.out.println("linkedHashMap===>"+linkedHashMap);

        Optional<Map.Entry<Character, Long>> optionalEntry = linkedHashMap.entrySet().stream().filter(entry->entry.getValue()==1).findFirst();
        if(optionalEntry.isPresent()){
           return Math.toIntExact(optionalEntry.get().getValue());
        }

        return -1;

    }


   static int getFirstUniqueCharIndex(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!map.containsKey(c)) {
               map.put(c,i);
            } else {
               map.put(c,-1);
            }
        }

      /* Optional<Map.Entry<Character, Integer>> first = map.entrySet().stream().filter(entry -> entry.getValue() > -1).findFirst();

        if(first.isPresent()){
            return first.get().getValue();
        }
        return -1;*/

        ///or

       int min = Integer.MAX_VALUE;
        for (char ch : map.keySet() ) {
            if(map.get(ch)>-1 && map.get(ch)<min){
                min = map.get(ch);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}
