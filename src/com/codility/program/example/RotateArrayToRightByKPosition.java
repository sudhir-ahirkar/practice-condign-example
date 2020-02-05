package com.codility.program.example;

import java.util.Arrays;

public class RotateArrayToRightByKPosition {

  public static void main(String[] args) {
    int[] arr= {3, 8, 9, 7, 6} ;
    int k=3;
    int[] processedArr=rotateArrayByK(arr,k);
    Arrays.stream(processedArr).forEach(System.out::println);

  }

  private static int[] rotateArrayByK(int[] arr, int k) {
    for (int i = 0; i < k; i++) {
      int temp = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {

        arr[j] = arr[j-1];

      }
      arr[0] = temp;
    }
    return arr;
  }

}
