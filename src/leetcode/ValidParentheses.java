package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
//       String s = "()[]{}";
       String s = "(]";
        if(isValid(s)){
            System.out.println(s+" is a valid String");
        }else{
            System.out.println(s+ " is not valid String");
        }
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
