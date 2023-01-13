package leetcode;

public class HappyNumber {

/*  Write an algorithm to determine if a number n is happy.
    A happy number is a number defined by the following process:
    Starting with any positive integer, replace the number by the sum of the squares of its digits.
    Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
    Those numbers for which this process ends in 1 are happy.
    Return true if n is a happy number, and false if not.

     Example 1:

    Input: n = 19
    Output: true
    Explanation:
            12 + 92 = 82
            82 + 22 = 68
            62 + 82 = 100
            12 + 02 + 02 = 1
    Example 2:

    Input: n = 2
    Output: false

    Constraints:
            1 <= n <= 231 - 1*/

    public static void main(String[] args) {
//        int n = 19;
        int n = 11;

        boolean check = happyNum(n);
        System.out.println("check===>" + check);
    }

    public static boolean happyNum(int n) {
        if (n == 1) {
            return true;
        }
        if (n < 9) {
            return false;
        }
        int sum = 0;
        while (n > 0) {
            int num = n % 10;
            sum = sum + (num * num);
            n = n / 10;
        }
        return happyNum(sum);
    }

    public static boolean Check(int n) {
        // base cases
        if (n == 1 || n == 7) {
            return true;
        } else if (n <= 9) {
            return false;
        }
        int ans = 0;
        while (n > 0) {
            int last_digit = n % 10;
            last_digit = (last_digit * last_digit);
            ans = ans + last_digit;
            n /= 10;
        }
        // ans gives you second number and that number in function again
        return Check(ans);
    }

}
