package leetcode;

import java.util.Arrays;

import static java.util.Arrays.sort;


/*75. Sort Colors
        Medium
        13.5K
        487
        Companies Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same
        color are adjacent, with the colors in the order red, white, and blue.
        We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
        You must solve this problem without using the library's sort function.

        Example 1:

        Input: nums = [2,0,2,1,1,0]
        Output: [0,0,1,1,2,2]
        Example 2:

        Input: nums = [2,0,1]
        Output: [0,1,2]


        Constraints:

        n == nums.length
        1 <= n <= 300
        nums[i] is either 0, 1, or 2.


        Follow up: Could you come up with a one-pass algorithm using only constant extra space?*/

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors1(nums);

        // Quick Sort
//        quickSort(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    // Mine example
    private static void sortColors1(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1, temp;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp;
                    high--;
            }
        }
    }

    private static void quickSort(int[] nums, int low, int high) {
        while (low < high) {
            int pidx = partition(nums, low, high);
            quickSort(nums, low, pidx - 1);
            quickSort(nums, pidx + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        i++;
        int temp = nums[i];
        nums[i] = pivot;
        nums[high] = temp;
        return i;
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
