package practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SynecronInterviewExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Abhishek","Dharmendra","Juhi","Jai");

        Set<Character> set = new HashSet<>();
        set.add('A'); set.add('E'); set.add('I'); set.add('O'); set.add('U');
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('o');

        String input = "Dharmendra";
        // count repeated characters
        Map<Character, Long> characterCountMap = input
                .chars() // convert to IntStream
                .mapToObj(c -> (char) c) // map to Character object
                .filter(ch -> !Character.isWhitespace(ch))
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));

//        list.stream().filter(e->e.chars() // convert to IntStream
//                .mapToObj(c -> (char) c) // map to Character object
//                .filter(ch -> set.contains(ch)))

        System.out.println("characterCountMap===>"+characterCountMap);

//      List<Stream<Integer>> collect = list.stream().map(e -> e.chars().boxed()).filter(e -> set.contains(e)).collect(Collectors.toList());
        List<Stream<Integer>> collect = list.stream().map(e -> e.chars().boxed()).collect(Collectors.toList());
        System.out.println("collect===>"+collect);

    }

}
