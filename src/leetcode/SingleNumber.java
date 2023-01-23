package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber {

/*    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    You must implement a solution with a linear runtime complexity and use only constant extra space.



    Example 1:

    Input: nums = [2,2,1]
    Output: 1
    Example 2:

    Input: nums = [4,1,2,1,2]
    Output: 4
    Example 3:

    Input: nums = [1]
    Output: 1


    Constraints:

            1 <= nums.length <= 3 * 104
            -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.*/

    public static void main(String[] args) {

//        int[] arr =  {2,2,1};
        int[] arr =  {4,1,2,1,2};
//        int[] arr =  {2,2,1};
//        int[] arr =  {2,2,1};
        int num = singleNumber1(arr);
        System.out.println("Single Number from Array : "+ num);
    }

    // Mine solution
    public static int singleNumber1(int[] nums) {
        int singleNum = 0;
        for (int i = 0; i < nums.length; i++) {
           singleNum = singleNum ^ nums[i];
        }
        return singleNum;
    }

    public static int singleNumber(int[] nums) {
        List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Integer integer = lst.stream().filter(e -> Collections.frequency(lst, e) == 1).findAny().get();
        return integer;
    }

    /*public static int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }*/
}
