package sorting;

// package whatever; // don't place package name!
// Installed Libraries: JSON-Simple, JUNit 4, Apache Commons Lang3
import java.io.*;

class MyCode {

    public static void devide(int[] arr, int si, int ei){

        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        devide(arr,si,mid);
        devide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);

    }

    private static void conquer(int[] arr, int si, int mid, int ei){

        int[] mergedArr = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                mergedArr[x++] = arr[idx1++];
            }else{
                mergedArr[x++] = arr[idx2++];
            }
        }

        while(idx1<=mid){
            mergedArr[x++] = arr[idx1++];
        }
        while(idx2<=ei){
            mergedArr[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<mergedArr.length; i++,j++){
            arr[j] = mergedArr[i];
        }

    }

    public static void main (String[] args) {
        int arr[] = {6,3,9,5,2,8,7};
        int n = arr.length;
        devide(arr,0,n-1);
        for(int num : arr){
            System.out.print(num +" ");
        }

    }
}

