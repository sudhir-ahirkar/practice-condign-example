package com.FindOutMissingNumberInArray;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by sudhir.ahirkar on 12/3/2017.
 */
public class Test {

//    Set<Integer> set = new HashSet<>();
//    set.add(43);
//    set.add(423);
//    set.add(11);
//    set.add(44);
//    set.add(56);
//    set.add(422);
//    set.add(34);
//    int[] arr = set.stream().mapToInt(Integer::intValue).toArray();

  static   Integer ars[]={1,5,6,7,9,2,3,4};

  public static void main(String args[]){

      Arrays.sort(ars);

      int size=ars.length+1;

      int expectedTotal=size*(size+1)/2;

      Integer sum = Stream.of(ars).reduce(Integer::sum).get();

      System.out.println("expectedTotal===."+expectedTotal);

      System.out.println("Missing number ==>"+(expectedTotal-sum));


  }

}
