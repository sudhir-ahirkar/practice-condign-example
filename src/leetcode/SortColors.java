package leetcode;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {

       int[] nums = {2,0,2,1,1,0};
       sortColors(nums);
       System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length - 1, temp;

        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
//                    if(nums[])
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2: {
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
