package leetcode;

public class RemoveAllSpecialCharacter {

    public static void main(String[] args) {
        String s = "Ja&I$9#nvj@)FVF";
        String StringWithoutSpecialChar = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Special character removed from s ===>"+StringWithoutSpecialChar);

    }

}
