package tdd.roman;

public class RomanNumerals {
    private record Numeral(int value,)
    public static String convert(int i) {
        if(i>=10) return "X"+convert(i-10);
        if(i>=9) return "IX"+convert(i-9);
        if(i>=5) return "V"+convert(i-5);
        if(i>=4) return "IV"+convert(i-4);
        return "I".repeat(i);
    }
}
