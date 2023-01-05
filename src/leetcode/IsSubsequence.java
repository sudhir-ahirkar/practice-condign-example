package leetcode;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean isSubsequence = isSubsequence(s, t);
        System.out.println("False ===>" + isSubsequence);
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        if (i == s.length())
            return true;
        else
            return false;
    }
}
