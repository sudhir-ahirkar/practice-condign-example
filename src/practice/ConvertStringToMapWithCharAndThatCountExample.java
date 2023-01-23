package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStringToMapWithCharAndThatCountExample {

    public static void main(String[] args) {
        String str = "Geeks for Geeks ok i am";
//        Map<Character, Long> charMapArr = Arrays.stream(Stream.of(str.toCharArray()).toArray(Character[]::new)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println("charMapArr====>"+charMapArr);
        str.chars().mapToObj(e->(char)e).forEach(System.out::println);

        Map<Character, Long> mapChar = str.chars().mapToObj(e -> (char) e).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        Map<Character, Long> mapChar = str.chars().mapToObj(e -> Character.).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("mapChar====>"+mapChar);


        Map<Character,Integer> mapCharArr = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            Integer value = mapCharArr.get(c);
//            if(value==null){
//                mapCharArr.put(c,1);
//            }else{
//                mapCharArr.put(c,++value);
//            }
            /// OR /////
            int charFreq = mapCharArr.getOrDefault(c, 0) + 1;
            mapCharArr.put(c,charFreq);

        }
        System.out.println("mapCharArr using manual ===>"+mapCharArr);
    }
}

          