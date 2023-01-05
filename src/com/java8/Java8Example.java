package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.reverseOrder;

public class Java8Example {
    public static void main(String[] args) {
        int[] arr  = {1,8,9,7,12,45,87,16};

        // Second highest num
        Integer secondHighest = Arrays.stream(arr).boxed().sorted(reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second Highest list ==>"+secondHighest); //45

        Integer thirdHighest = Arrays.stream(arr).boxed().sorted(reverseOrder()).skip(2).findFirst().get();
        System.out.println("Third Highest list ==>"+thirdHighest); //16

        // How to use limit
        List<Integer> sortedFirstThreeElementAndPrintTheSame = Arrays.stream(arr).boxed().sorted().limit(3).collect(Collectors.toList());
        System.out.println("sortedFirstThreeElementAndPrintTheSame==>"+sortedFirstThreeElementAndPrintTheSame);

        Integer secondMiniumNumber = Arrays.stream(arr).boxed().sorted().skip(1).findFirst().get();
        System.out.println("secondMiniumNumber ===>"+secondMiniumNumber);

        int minimumNumber = IntStream.of(arr).min().getAsInt();
        System.out.println("Minimun Number of Array ==>"+minimumNumber);
        int maximumNumber = IntStream.of(arr).max().getAsInt();
        System.out.println("Max Number of Array ==>"+maximumNumber);
        double average = IntStream.of(arr).average().getAsDouble();
        System.out.println("average Number of Array ==>"+average);




    }
}
