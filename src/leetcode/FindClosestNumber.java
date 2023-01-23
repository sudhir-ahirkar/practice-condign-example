package leetcode;

public class  FindClosestNumber {

    public static void main(String[] args) {
//        int[] arr = {-100000,-100000};
//        int[] arr = {-100000,100000};
//        int[] arr = {-4,-2,1,4,8};
        int[] arr = {0,2, 1, 3, -1, 8,0};
        int closestNum = getClosestToZero6(arr);
//        int closestNum = getClosestToZero1(arr);
        System.out.println("Closest Number ===>" + closestNum);
        System.out.println("findClosestNumber: Two of largest two element is : " + findClosestNumber1(arr));

    }

    private static int getClosestToZero6(int[] arr) {
        int minNum = Integer.MAX_VALUE, closeNumber = 0;
        for (int num : arr){
            if(Math.abs(num)<minNum){
                closeNumber = num;
                minNum = Math.abs(minNum);
            }else if(minNum==Math.abs(num)){
                closeNumber = num;
            }
        }
        return closeNumber;
    }

    private static int findClosestNumber1(int[] arr) {
        int closeNumber = Integer.MAX_VALUE;
        for (int num : arr){
            if(Math.abs(num)<Math.abs(closeNumber) || num == Math.abs(closeNumber)){
                closeNumber = num;
            }
        }
        return closeNumber;
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
        for (int num : a) {
            if (Math.abs(num) < minNum) {
                minNum = Math.abs(num);
                closeNum = num;
            } else if (Math.abs(num) == minNum) {
                closeNum = Math.max(closeNum, num);
            }
        }
        return closeNum;
    }

    public static int findClosestNumber(int[] arr) {
        int answer = Integer.MAX_VALUE;
        for (int index : arr) {
//returns the absolute value of a number that is it returns answer if answer is positive //or zero, and the negation of answer if answer is negative.
            if (Math.abs(index) < Math.abs(answer) || index == Math.abs(answer)) {
                answer = index;
            }
        }
        return answer;
    }

        public static int getClosestToZero1(int[] a) {
      /*
      Please implement this method to return the integer number
      in a given array that is closest to zero.

      If there are two equally closest to zero elements like 2 and -2
      consider the positive element, i.e. 2, to be closer to zero
    */
        int minNum = Integer.MAX_VALUE, closerNum = 0;
        for (int num: a) {
            int absNum = Math.abs(num);
            if(minNum>absNum){
                minNum = absNum;
                closerNum = num;
            } else if (minNum == absNum) {
                closerNum = Math.max(closerNum,num);
            }
        }
        return closerNum;
    }


















}