package com.codility.program.example;

import java.util.Arrays;

public class FindOddNumberFromArrayExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {9, 3, 9, 3, 9, 7, 9, 12, 14, 3};
        int[] resultArr = Arrays.stream(arr).filter(e -> e % 2 != 0).toArray();
        System.out.println(Arrays.toString(resultArr));
    }

}
