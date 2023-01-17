package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.Map.Entry.comparingByValue;
public class SortMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("mohit", 1);
        map.put("rohit", 2);
        map.put("dhruv", 3);
        map.put("abhishek", 4);
        map.put("xyz", -1);

//        map.entrySet().stream().sorted(Comparator.com
        Map<String, Integer> sorted = map.entrySet().stream().sorted(comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("sorted====>" + sorted);

        // Mine for practice only

        LinkedHashMap<String, Integer> myPractice = map.entrySet().stream().sorted(comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("myPractice====>" + myPractice);

        //more clean way ==>
        Map<String, Integer> sorted1 = map.entrySet().stream().sorted(comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("sorted1====>" + sorted1);
//        Read more: https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#ixzz7nQZTXwQy
//        https://javarevisited.blogspot.com/2017/09/java-8-sorting-hashmap-by-values-in.html#axzz7nQYhAKxT
    }
}



