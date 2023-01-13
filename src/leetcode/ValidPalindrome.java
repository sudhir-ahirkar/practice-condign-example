package leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println("is String palindrom : " + isPalindrome1(s));
    }

    public static boolean isPalindrome1(String s) {
        boolean isValid = true;
        String pattern = "[^a-zA-Z0-9]";
        s = s.replaceAll(pattern, "").toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isValid = false;
            }
        }
        return isValid;
    }

    public static boolean isPalindrome(String s) {
        boolean isValid = true;
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return isValid;
    }
}
