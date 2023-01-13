package com.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesAndUseSameArray {
    public static void main(String[] args) {
//        int[]  nums = {1,1,2};
        int[]  nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1;j<nums.length;j++){
            // If the two nums are equal then continue
            if(nums[i] ==  nums[j]){
                continue;
            }
            // if different then increment and store the new value
            nums[++i] = nums[j];
        }
        System.out.println(Arrays.toString(nums));
        // return i + 1; after placing i unique elements.
        return i+1;
    }
}
