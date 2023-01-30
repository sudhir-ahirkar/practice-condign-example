package leetcode;

//448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

/*Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

        Example 1:

        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [5,6]
        Example 2:

        Input: nums = [1,1]
        Output: [2]


        Constraints:

        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n*/
public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> resultLst = findDisappearedNumbers(nums);
        System.out.println("resultLst====>" + resultLst);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                lst.add(i + 1);
            }
        }
        return lst;
    }
}
