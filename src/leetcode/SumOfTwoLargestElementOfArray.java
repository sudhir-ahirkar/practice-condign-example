package leetcode;

public class SumOfTwoLargestElementOfArray {

    public static void main(String[] args) {
        int[] arr = {-8, 9, -1, -16, 2, 4,0};
//      System.out.println("Two of largest two element is : " + sumOfTwoLargestElements(arr));
        System.out.println("sumOfTwoLargestElements4 :Two of largest two element is : " + sumOfTwoLargestElements4(arr));


    }

    public static int sumOfTwoLargestElements(int[] a) {
        /*
      Please implement this method to return the sum of
      the two largest integer numbers in a given array
      */
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;


        for (int i = 0; i < a.length; i++) {
            if(firstNum==a[i])continue;
            if (firstNum < a[i]) {
                secondNum = firstNum;
                firstNum = a[i];
            } else if (secondNum < a[i]) {
                secondNum = a[i];
            }
        }
        return firstNum + secondNum;
    }



    public static int sumOfTwoLargestElements1(int[] a) {
        /*
      Please implement this method to return the sum of
      the two largest integer numbers in a given array
      */
       int firstNum = Integer.MIN_VALUE;
       int secondNum = Integer.MIN_VALUE;
       for (int num : a){
           if(num>firstNum){
               secondNum = firstNum;
               firstNum = num;
           }else if (num>secondNum){
               secondNum = num;
           }
       }
        return firstNum+secondNum;
    }

    public static int sumOfTwoLargestElements2(int[] a) {
        /*
      Please implement this method to return the sum of
      the two largest integer numbers in a given array
      */
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;
        int thirdNum = Integer.MIN_VALUE;
        for (int num : a){
            if(num>firstNum){
                secondNum = firstNum;
                thirdNum = secondNum;
                firstNum = num;
            }else if (num>secondNum){
                thirdNum = secondNum;
                secondNum = num;
            }else if(num>thirdNum){
                thirdNum =num;
            }
        }
        return firstNum+secondNum+thirdNum;
    }

    public static int sumOfTwoLargestElements3(int[] a) {
        /*
      Please implement this method to return the sum of
      the two largest integer numbers in a given array
      */
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;
        int thirdNum = Integer.MIN_VALUE;
        int fourNum = Integer.MIN_VALUE;

        for (int num : a){
            if(num>firstNum){
                secondNum = firstNum;
                thirdNum = secondNum;
                firstNum = num;
            }else if (num>secondNum){
                thirdNum = secondNum;
                secondNum = num;
            }else if(num>thirdNum){
                thirdNum =num;
            }
        }
        return firstNum+secondNum+thirdNum;
    }

    public static int sumOfTwoLargestElements4(int[] a) {
        /*
      Please implement this method to return the sum of
      the two largest integer numbers in a given array
      */
        int firstNum = Integer.MIN_VALUE;
        int secondNum = Integer.MIN_VALUE;
        int thirdNum = Integer.MIN_VALUE;
        int fourNum = Integer.MIN_VALUE;
//        int[] arr = {-8, 9, -1, -16, 2, 4};


        for (int i=0; i<a.length; i++){
            System.out.println("====>"+a[i]);
            if(a[i]>firstNum){
                secondNum = firstNum;
                thirdNum = secondNum;
//                fourNum = thirdNum;
                firstNum = a[i];
            }else if (a[i]>secondNum){
                thirdNum = secondNum;
//                fourNum = thirdNum;
                secondNum = a[i];
            }else if(a[i]>thirdNum){
                fourNum = thirdNum;
                thirdNum =a[i];
            }else if(a[i]>fourNum){
                fourNum = a[i];
            }

        }
        return firstNum+secondNum+thirdNum+fourNum;
    }
}
