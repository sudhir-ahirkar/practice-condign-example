package leetcode;

import java.util.Arrays;
/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.



        Example 1:

        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        Example 2:

        Input: nums = [0]
        Output: [0]


        Constraints:

        1 <= nums.length <= 104
        -231 <= nums[i] <= 231 - 1*/

public class MoveZeroes {
    public static void main(String[] args) {

        int[] arr = {1,8,0,10,9,1,0,7};
        int[] processedArr = moveZeroes(arr);
        Arrays.stream(processedArr).forEach(System.out::println);
    }

    public static int[] moveZeroes(int[] nums){
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=0){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        return nums;
    }
}
