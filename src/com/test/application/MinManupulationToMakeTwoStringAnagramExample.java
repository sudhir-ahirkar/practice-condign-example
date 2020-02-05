package com.test.application;

public class MinManupulationToMakeTwoStringAnagramExample {
  // function to calculate minimum numbers
  // of characters to be removed to make
  // two strings anagram
  static int remAnagram(String str1, String str2) {
    // make hash array for both string
    // and calculate frequency of each
    // character
    int count1[] = new int[26];
    int count2[] = new int[26];

    // count frequency of each character
    // in first string
    for (int i = 0; i < str1.length(); i++)
      count1[str1.charAt(i) - 'a']++;

    // count frequency of each character
    // in second string
    for (int i = 0; i < str2.length(); i++)
      count2[str2.charAt(i) - 'a']++;

    // traverse count arrays to find
    // number of characters to be removed
    int result = 0;
    for (int i = 0; i < 26; i++)
      result += Math.abs(count1[i] - count2[i]);
    return result;
  }

  // Driver program to run the case
  public static void main(String[] args) {
    String str1 = "bcadeh", str2 = "hea";
    System.out.println(remAnagram(str1, str2));
    System.out.println(remAnagram1(str1, str2));
  }

  private static int remAnagram1(String str1, String str2) {
    int count1[] = new int[26];
    int count2[] = new int[26];
    for (int i = 0; i < str1.length(); i++) {
      count1[str1.charAt(i)-'a']++;
    }
    for (int i = 0; i < str2.length(); i++) {
      count2[str2.charAt(i)-'a']++;
    }
    
    int result=0;
    for (int i = 0; i < 26; i++) {
      result+=Math.abs(count1[i]-count2[i]);
    }
    return result;
  }
}
