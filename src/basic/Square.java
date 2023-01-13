package basic;

import java.util.function.Function;

public class Square {

    public int square(int x){
        return x*x;
    }

    public static void main(String[] args) {
//        Function<Integer,Integer> lamda = x ->return x * x;
//        Function<Integer,Integer> lamda1 = x -> {x * x};
        Function<Integer,Integer> lamda2 = x -> x * x;
//        Function<Integer,Integer> lamda3 = (int x) -> { x * x };

    }
}
