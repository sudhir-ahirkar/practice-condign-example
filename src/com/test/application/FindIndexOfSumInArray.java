package com.test.application;

import java.util.Arrays;
import java.util.stream.Stream;

public class FindIndexOfSumInArray {

  public static void main(String[] args) {
    
   int[] arr = {8,7,2,5,3,1};
   int[] indexArr= getIndexArr(arr,10);
   for (int i = 0; i < indexArr.length; i++) {
    
     System.out.println(indexArr[i]);
  }
   if(indexArr!=null) {
//     Arrays.asList(indexArr).stream().forEach(System.out::println);
     Stream.of(indexArr).forEach(s->System.out.println(s));
     Arrays.stream(indexArr).forEach(System.out::println);
     Arrays.asList(indexArr).stream().forEach(s -> System.out.println(s));
     System.out.println(Arrays.asList(indexArr));
//     System.out.println(Arrays.toString(indexArr));
   }else {
     System.out.println("Sum is not found");
   }
  }

  private static int[] getIndexArr(int[] arr, int sum) {
   
    int[] indexArr=new int[2];
    for (int j = 0; j < arr.length; j++) {
      for (int j2 = j+1; j2 < arr.length; j2++) {
        if(arr[j]+arr[j2]==sum) {
          indexArr[0]=j;
          indexArr[1]=j2;
          return indexArr;
        }
      }
    }
    return null;
  }

}
