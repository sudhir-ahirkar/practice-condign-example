package practice;

import java.util.Arrays;
import java.util.Scanner;


public class InterchangeStringFirstAndLastCharacterExample {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String interchangedSting = interChangeFirstAndLastChar(str);
        System.out.println("interchangedSting====>"+interchangedSting);
    }
    private static String interChangeFirstAndLastChar(String str) {
        StringBuilder processedStr = new StringBuilder();
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            String st = strArray[i];
            char[] chars = st.toCharArray();
            char temp = chars[0];
            chars[0] = chars[chars.length-1];
            chars[chars.length-1] = temp;
//            strArray[i] = new String(chars);
            processedStr.append(chars).append(" ");
        }
//        return Arrays.toString(strArray);
        return processedStr.toString().trim();
    }
}





