package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//       String s = "()[]{}";
        String s = "({[]})[]{}";

//        String s = "(]";
//                String s = "()";

        /*if(isValid(s)){
            System.out.println(s+" is a valid String");
        }else{
            System.out.println(s+ " is not valid String");
        }*/

        /// My practice

        if (isValidParanthesis(s)) {
            System.out.println(s + " is a valid String");
        } else {
            System.out.println(s + " is not valid String");
        }
    }

    public static boolean isValidParanthesis(String s) {
        final Map<Character, Character> bucketMap = new HashMap<>(Map.of('(', ')', '{', '}', '[', ']'));
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (bucketMap.containsKey(c)) {
                stack.push(c);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }
                char previousChar = stack.peek();
                if (c != bucketMap.get(previousChar)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        final HashMap<Character, Character> bracketMap = new HashMap<>(
                Map.of('(', ')', '{', '}', '[', ']'));

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char bracketChar = s.charAt(i);
            if (bracketMap.containsKey(bracketChar)) {
                stack.push(bracketChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char previousBracketChar = stack.peek();
                if (bracketChar != bracketMap.get(previousBracketChar)) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
