package com.leetcode;
/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.

       Note :  You must write an algorithm with O(log n) runtime complexity.

        Example 1:
        Input: nums = [1,3,5,6], target = 5
        Output: 2

        Example 2:
        Input: nums = [1,3,5,6], target = 2
        Output: 1
        Example 3:

        Input: nums = [1,3,5,6], target = 7
        Output: 4*/
public class SearchInsert {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 6};
//        int target = 5;
//        int[] nums = {1,3,5,6}; int target = 2;
        int[] nums = {1,3,5,6}; int target = 7;

        System.out.println("Element found or it can be available at index =>" + searchInsert1(nums, target));
    }


    public static int searchInsert1(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>nums[mid]){
                start = mid+1;
            }else if(target==nums[mid]){
                return mid;
            }if(target<nums[mid]){
                end = mid-1;
            }
        }
        return start;
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
