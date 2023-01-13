package com.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
//        int[] arr = {3,4,-1,1};
//        int[] arr = {7,8,9,11,12};

        System.out.println("Missing Positive Num ==>"+firstMissingPositive(arr));
    }

    public static  int firstMissingPositive(int[] nums) {
        int misssingPositiveNum = 1;

        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] == 0 || nums[i] < 0) {
                misssingPositiveNum = Integer.min(misssingPositiveNum, misssingPositiveNum);
            } else {
                misssingPositiveNum = Integer.min(misssingPositiveNum, nums[i]);
            }
            if (misssingPositiveNum != nums.length) {
                misssingPositiveNum++;
            }

        }
        System.out.println(misssingPositiveNum);
        return misssingPositiveNum;
        // My approach
       /* int count = 1;
        Set<Integer> setOfNum = Arrays.stream(nums).boxed().collect(Collectors.toSet());

        for (int i = 0; i < setOfNum.size(); i++) {
            if (!setOfNum.contains(count)) {
                return count++;
            }
            count++;
        }
        return count;*/

        /*setOfNum.forEach(integer -> {
            if (!setOfNum.contains(count)) {
                int count1 = count;
                return count1;
            }
        });*/



    }
}