package tdd.roman;

import java.util.List;

public class RomanNumerals {
    private record Numeral(int value,String symbol){}
    private static final List<Numeral> NUMERALS=List.of(new Numeral(1000,"M"),new Numeral(900,"CM"),new Numeral(500,"D"),new Numeral(400,"CD"),new Numeral(100,"C"),new Numeral(90,"XC"),new Numeral(50,"L"),new Numeral(40,"XL"),new Numeral(10,"X"),
            new Numeral(9,"IX"),
            new Numeral(5,"V"),
            new Numeral(4,"IV"),
            new Numeral(1,"I"));


    public static String convert(int i) {
        if(i>3999 || i<1) throw new IllegalArgumentException("Out of range ! Not supported");
        StringBuilder result=new StringBuilder();
        int remaining=i;
        for(Numeral num: NUMERALS){
            while(remaining>=num.value()){
                result.append(num.symbol());
                remaining-=num.value();
            }
        }
        return result.toString();
    }
}
