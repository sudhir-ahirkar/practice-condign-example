package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringCharacterCountExample {

    public static void main(String[] args) {
        String word = "AAABBB";
        process1(word);
        process2(word);
    }

    private static void process2(String word){
        Map<String, Long> charCount0 = word.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> charCount1 = word.chars().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> charCount2 = word.chars().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(e->e, Collectors.counting()));

        Map<String, Long> charCount3 = IntStream.range(0, word.length())
                .mapToObj(i -> word.substring(i, i + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character,Long> hm = word.chars().mapToObj(c->
                (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println("hm======>"+hm);

        System.out.println("charCount2===process2=>"+charCount2);
        System.out.println("charCount3===process2=>"+charCount3);


        String str = "abcaadcbcb";

        Map<String, Long> charCount5  =
                Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println("charCount5====>"+charCount5);


    }
    private static void process1(String word) {
        Map<String, Integer> charCount = new HashMap();
        for(String charr: word.split("")){
            Integer added = charCount.putIfAbsent(charr, 1);
            if(added != null)
                charCount.computeIfPresent(charr,(k,v) -> v+1);
        }

        System.out.println(charCount);
    }

}
