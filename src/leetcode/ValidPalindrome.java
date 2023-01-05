package leetcode;

public class ValidPalindrome {

    public static void main(String[] args) {

       String s = "A man, a plan, a canal: Panama";
        System.out.println("is String palindrom : "+isPalindrome(s));
    }

    public static  boolean isPalindrome(String s) {
        boolean isValid = true;
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        for(int i=0; i<str.length()/2; i++){

            if(str.charAt(i)!=str.charAt(str.length()-i-1)){

                return false;
            }
        }

        return isValid;
    }
}
