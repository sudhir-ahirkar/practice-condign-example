package com.Arrayprogram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sudhir.ahirkar on 12/16/2017.
 */
public class InterchangeLongStringFirstAndLastCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		String interchangedSting = interChangeFirstAndLastChar(str);
		System.out.println("Interchanged String=====>" + interchangedSting.toString());
	}

	public static String interChangeFirstAndLastChar(String str) {
		if (str == null)
			return "";
		String strArr[] = str.split(" ");
		String newStrArr[] = new String[strArr.length];

		for (int i = 0; i < strArr.length; i++) {

			String original = strArr[i];
//////////////////not working
//			char firstChar = original.charAt(0);
//			char lastChar = original.charAt(original.length() - 1);
//			original = original.replace(firstChar, lastChar);
//			original = original.replace(lastChar, firstChar);
//			newStrArr[i] = original;
//////////////////////////////working
            char[] cs = original.toCharArray();
            char first = cs[0];
            cs[0] = cs[cs.length -1];
            cs[cs.length -1] = first;
            newStrArr[i]= new String(cs);
		}

		return Arrays.toString(newStrArr);

	}
}
