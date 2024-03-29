package leetcode;


/*
     You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
     The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any
     leading 0's.

        Increment the large integer by one and return the resulting array of digits.

        Example 1:

        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
        Example 2:

        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
        Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].
        Example 3:

        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].*/

public class PlusOne {
    public static void main(String[] args) {

//        int[] arr = {0};
//        int[] arr = {9};
                int[] arr = {9,9};

//        int[] arr = {1, 2, 3, 9};

//        plusOne(arr);
        plusOne1(arr);

    }

    private static int[] plusOne1(int[] arr) {
        int lastIndex = arr.length-1;
        for (int i = lastIndex; i >=0; i--) {
            if(arr[lastIndex]<9){
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] ans = new int[arr.length+1];
        ans[0]=1;
        return ans;
    }













    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        for (int i = index; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}
