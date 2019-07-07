package com.MapKeyFrequencyCalculate;

import java.util.*;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {

 static  Integer array[] ={10, 20,10,30,70,10,20};

    public static void main(String args[]){

        List<Integer> list=new ArrayList<Integer>(Arrays.asList(array));
        System.out.println("Use frequest to find no. occurence==>"+Collections.frequency(list,10));

        Map<Integer,Integer> frequencyMap=new HashMap<Integer,Integer>();
//        Integer array[] ={10, 20,10,30,70,10,20};
         for (int i = 0; i <array.length ; i++) {
            Integer c=frequencyMap.get(array[i]);
            if(frequencyMap.get(array[i])==null)
                frequencyMap.put(array[i],1);
            else
                frequencyMap.put(array[i],++c);

        }

        for(Map.Entry<Integer,Integer> e : frequencyMap.entrySet()){

            System.out.println("Key value===>"+e.getKey()+" value frequency "+e.getValue());

        }


    }



}
