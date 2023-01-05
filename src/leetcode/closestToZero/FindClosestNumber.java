package leetcode.closestToZero;

import java.util.HashSet;
import java.util.Set;

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