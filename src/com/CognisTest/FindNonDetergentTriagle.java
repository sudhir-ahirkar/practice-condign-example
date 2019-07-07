package com.CognisTest;

public class FindNonDetergentTriagle {
    public static void main(String[] args) {

        int a[]={7,10,7};
        int b[]={2,3,4};
        int c[]={2,7,4};



      String s[]= findNonDetergentTria(a,b,c);

      for (String str: s)
          System.out.println("str=====>"+str);




    }

    private static String[] findNonDetergentTria(int[] a, int[] b, int[] c) {
        String s[]=new String[a.length];

        for (int i = 0; i < a.length; i++) {

            if(a[i]+b[i]>c[i] && a[i]+c[i]>b[i] && b[i]+c[i]>a[i]){
                s[i]="YES";
            }else {
                s[i]="NO";
            }


        }

        return s;

    }
}
