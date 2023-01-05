package practice;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindOddNumBetweenNumAndReturnArrayExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int j=s.nextInt();

        List<Integer> oddNumLst = IntStream.range(i,j).boxed().filter(e->e%2!=0).collect(Collectors.toList());
        int[] oddIntArray = IntStream.range(i,j).filter(e->e%2!=0).toArray();
        Integer[] oddIntegerArr = IntStream.range(i, j).boxed().filter(e -> e % 2 != 0).toArray(Integer[]::new);

        //convert oddNumLst to Array
        Integer[] integersArrayFrmLst = oddNumLst.stream().toArray(Integer[]::new);


    }
}
