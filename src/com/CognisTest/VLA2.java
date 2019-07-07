package com.CognisTest;

import java.util.Arrays;
import java.util.Comparator;

public class VLA2  implements Comparator<VLA2> {

    int dishSize;

    VLA2(int d){
        dishSize=d;
    }

    public static void main(String[] args) {
        VLA2[] va={new VLA2(40),new VLA2(200),new VLA2(60)};

        Arrays.sort(va,va[0]);
        for (int i = 0; i < va.length; i++) {
            System.out.println("Check after sorting===="+va[i]);

        }
        int index=Arrays.binarySearch(va, new VLA2(40),va[0]);
        System.out.println("index===>"+index);
        int index2=Arrays.binarySearch(va, new VLA2(80),va[0]);
        System.out.println("index2===>"+index2);
    }




    @Override
    public int compare(VLA2 o1, VLA2 o2) {
        return o2.dishSize -o1.dishSize;
    }
}

