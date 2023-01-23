package leetcode.closestToZero;

import java.util.HashSet;
import java.util.Set;

//2239. Find Closest Number to Zero

/*Given an integer array nums of size n, return the number with the value closest to 0 in nums. If there are multiple answers, return the number with the largest value.

        Example 1:

        Input: nums = [-4,-2,1,4,8]
        Output: 1
        Explanation:
        The distance from -4 to 0 is |-4| = 4.
        The distance from -2 to 0 is |-2| = 2.
        The distance from 1 to 0 is |1| = 1.
        The distance from 4 to 0 is |4| = 4.
        The distance from 8 to 0 is |8| = 8.
        Thus, the closest number to 0 in the array is 1.
        Example 2:

        Input: nums = [2,-1,1]
        Output: 1
        Explanation: 1 and -1 are both the closest numbers to 0, so 1 being larger is returned.


        Constraints:

        1 <= n <= 1000
        -105 <= nums[i] <= 105*/

public class FindClosestNumber {

    public static void main(String[] args) {
//        int[] arr = {-100000,-100000};
//        int[] arr = {-100000,100000};
//        int[] arr = {-4,-2,1,4,8};
        int[] arr = {1, 1, 1, 1, 1, 2, -1, 3, 1, 8, -8,-1};
        int closestNum = getClosestToZero(arr);
//        int closestNum = getClosestToZero1(arr);
        System.out.println("Closest Number ===>" + closestNum);
    }

    //2. Implement the following function
    public static int getClosestToZero(int[] a) {
      /*
      Please implement this method to return the integer number
      in a given array that is closest to zero.
      If there are two equally closest to zero elements like 2 and -2
      consider the positive element, i.e. 2, to be closer to zero
    */
        int minNum = Integer.MAX_VALUE, closeNum = 0;
        Set<Integer> clNumSet = new HashSet<>(a.length);
        System.out.println("size==>" + clNumSet.size());
        for (int num : a) {
            if (!clNumSet.add(num))
                continue;
            if (Math.abs(num) < minNum) {
                minNum = Math.abs(num);
                closeNum = num;
            } else if (Math.abs(num) == minNum) {
                closeNum = Math.max(closeNum, num);
            }
        }
        System.out.println("clNumSet size ==>"+clNumSet);
        return closeNum;
    }

    public static int getClosestToZero1(int[] a) {
      /*
      Please implement this method to return the integer number
      in a given array that is closest to zero.

      If there are two equally closest to zero elements like 2 and -2
      consider the positive element, i.e. 2, to be closer to zero
    */
        int minNum = Integer.MAX_VALUE, closerNum = 0;
        for (int num : a) {
            int absNum = Math.abs(num);
            if (minNum > absNum) {
                minNum = absNum;
                closerNum = num;
            } else if (minNum == absNum) {
                closerNum = Math.max(closerNum, num);
            }
        }
        return closerNum;
    }


}