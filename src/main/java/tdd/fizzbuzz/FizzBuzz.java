package tdd.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static String convert(int i) {
        if(i<1) throw new IllegalArgumentException("Not strict. positif !");
        if(isDivisibleBy(i,15)) return "FizzBuzz";
        if(isDivisibleBy(i,3)) return "Fizz";
        if(isDivisibleBy(i,5)) return "Buzz";
        return  String.valueOf(i);
    }


    public static boolean isDivisibleBy(int n , int divisor){
        return n%divisor==0;
    }

    public static List<String> sequence(int n) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=15;i++){
            list.add(convert(i));
        }
        return list;
    }
}
