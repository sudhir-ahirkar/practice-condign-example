package rotatebyleftandrightbyiteration;

import java.util.Arrays;

public class Test {
	
	/**
	 * 
	 * A simple Java Program to rotate an array by left and right by given number.
	 */

		public static void main(String[] args) {
		    int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
		    int k = 4;
//		    int k = 1;

		    System.out.println("Rotate given array " + Arrays.toString(input)
		        + " by 4 places to the left.");

		    int[] rotatedArray = rotateLeft(input, input.length, k);

		    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));

		    System.out.println("Rotate given array " + Arrays.toString(input)
		        + " by 4 places to the right.");

		    rotatedArray = rotateRight(rotatedArray, rotatedArray.length, k);

		    System.out.println("Rotated array: " + Arrays.toString(rotatedArray));


	}
		
		/**
		   * Java method to rotate a given array to the left specified by numOfRotations
		   * times
		   * 
		   * @param input
		   * @param length
		   * @param numOfRotations
		   * @return rotated array
		   */
		  private static int[] rotateLeft(int[] input, int length, int numOfRotations) {
		    for (int i = 0; i < numOfRotations; i++) {

		      // take out the first element
		      int temp = input[0];
		      for (int j = 0; j < length - 1; j++) {

		        // shift array elements towards left by 1 place
		        input[j] = input[j + 1];
		      }
		      input[length - 1] = temp;
		    }
		    return input;

		  }
		  
		  /**
		   * Java method to rotate a given array to the right specified by
		   * numOfRotations times
		   * 
		   * @param input
		   * @param length
		   * @param numOfRotations
		   * @return rotated array
		   */
		  private static int[] rotateRight(int[] input, int length, int numOfRotations) {
		    for (int i = 0; i < numOfRotations; i++) {

		      // take out the last element
		      int temp = input[length - 1];
		      for (int j = length - 1; j > 0; j--) {

		        // shift array elements towards right by one place
		        input[j] = input[j - 1];
		      }
		      input[0] = temp;
		    }
		    return input;

		  }

	/*
	 * Output Rotate given array [1, 2, 3, 4, 5, 6, 7, 8] by 4 places to the left.
	 * Rotated array: [5, 6, 7, 8, 1, 2, 3, 4] Rotate given array [5, 6, 7, 8, 1, 2,
	 * 3, 4] by 4 places to the right. Rotated array: [1, 2, 3, 4, 5, 6, 7, 8]
	 */

}
