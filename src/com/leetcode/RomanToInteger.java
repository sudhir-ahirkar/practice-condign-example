package com.leetcode;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();

        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        String s = "III";
        s = "LVIII";
        s = "MCMXCIV";
        int reqNum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            Character c = s.charAt(i);
            Character c1 = s.charAt(i+1);
            if(hm.get(c)<hm.get(c1)){
               reqNum -=hm.get(c);
            }else {
                reqNum += hm.get(c);
            }
        }
        reqNum+=hm.get(s.charAt(s.length()-1));
        System.out.println("reqNum==>"+reqNum);
    }
}
