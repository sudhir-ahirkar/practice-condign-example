package com.Arrayprogram;

import java.io.IOException;
/**
 * Created by sudhir.ahirkar on 12/16/2017.
 * Print number of words, vowels and frequency of each character
 Given a string str with uppercase, lowercase and special characters. The input string is to end with either a space or a dot. The problem is to calculate the number of words, vowels and frequency of each character of the string in a separate line
 */
// Java program to print Number of Words,
// Vowels and Frequency of Each Character
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintNumWord
{
    String str = "Geeks for Geeks ok i am";

    void words()
    {
        int wCount = 0, uCount = 0, vCount = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);

            switch (c)
            {
                case ' ':
                case '.':
                    wCount++; // more delimiters can be given
            }

            switch (c)
            {
                // program for calculating number of vowels
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vCount++;
//                break;
//                case ' ':
//                case '.':
//                	 wCount++;
                	
            }

            if (c >= 65 && c <= 90)
            {
                uCount++;
            }
        }

        System.out.println("Number of words = " + wCount);
        System.out.println("Number of vowels = " + vCount);
        System.out.println("Number of upper case characters = "
                + uCount);
    }

    // Function to calculate the frequency
    // of each character in the string
    void frequency()
    {
        // Creates an empty TreeMap
        TreeMap<Character, Integer> hmap =
                new TreeMap<Character, Integer>();

        // Traverse through the given array
        for (int i = 0; i < str.length(); i++)
        {
            Integer c = hmap.get(str.charAt(i));

            // If this is first occurrence of element
            if (c == null)
                hmap.put(str.charAt(i), 1);

                // If elements already exists in hash map
            else
                hmap.put(str.charAt(i), ++c);
        }

        // Print result
        for (Map.Entry m:hmap.entrySet())
            System.out.println("Character = " + m.getKey() +
                    " Frequency = " + m.getValue());
        char [] arr = str.toCharArray();
   Map<Character,Long> map =  Arrays.stream(Stream.of(arr).toArray(Character[]::new)).sequential().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        Map<Character,Long>   map = Arrays.stream(Stream.of(arr).toArray(Character[]::new)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("map===>"+map);
    }

    // Driver program to run and test above program
    public static void main(String args[]) throws IOException
    {
      PrintNumWord obj = new PrintNumWord();
        obj.words();
        obj.frequency();
    }
}