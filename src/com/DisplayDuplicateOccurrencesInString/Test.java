package com.DisplayDuplicateOccurrencesInString;

import java.util.*;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test
{
    public static void main(String args[]){

        String s="java";

      char c[]=  s.toCharArray();

       /* Map<Character,Integer> characterIntegerMap=new HashMap<>();

        for(char c1: c){

            if (characterIntegerMap.get(c1) == null)
                characterIntegerMap.put(c1, 1);
            else
                characterIntegerMap.put(c1, characterIntegerMap.get(c1) + 1);
        }

        System.out.println("characterIntegerMap==>"+characterIntegerMap);

        Set<Map.Entry<Character, Integer>> entries = characterIntegerMap.entrySet();

        for (Map.Entry<Character, Integer> e:entries )
            System.out.println("characterIntegerMap==>"+e.getKey()+" "+e.getValue());*/

        List<Character> characters=new ArrayList<Character>();

        System.out.println("characters==>"+characters);

        for(char c1: c){
            characters.add(c1) ;
        }

        for(char c1: c){
            System.out.println(c1+"==="+Collections.frequency(characters,c1));
        }




    }

}
