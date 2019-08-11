package rotatebyleftandrightbyiteration;

import java.util.Arrays;

public class RotateByRotation {
	public static void main(String[] args) {
	    int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
	    int k = 4;
//	    int k = 1;

	    System.out.println("Rotate given array " + Arrays.toString(input)
	        + " by 4 places to the left.");

	    int[] rotatedArray = rotateLeft(input, input.length, k);

	    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));

	    System.out.println("Rotate given array " + Arrays.toString(input)
	        + " by 4 places to the right.");

	    rotatedArray = rotateRight(rotatedArray, rotatedArray.length, k);
//
	    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));


}

	private static int[] rotateLeft(int[] input, int length, int k) {
		
		
		for(int i=0; i<k; i++) {
			
			int temp=input[0];
			
			for(int j=0;j<length-1;j++) {
				input[j]=input[j+1];
			}
			
			input[length-1]=temp;
		}
		
		return input;
	}
	
	
private static int[] rotateRight(int[] input, int length, int k) {
		
		
		for(int i=0; i<k; i++) {
			
			int temp=input[length-1];
			
			for(int j=length-1;j>0;j--) {
				input[j]=input[j-1];
			}
			
			input[0]=temp;
		}
		
		return input;
	}
}
