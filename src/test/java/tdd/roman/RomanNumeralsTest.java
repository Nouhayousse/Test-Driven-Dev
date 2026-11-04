package tdd.roman;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class RomanNumeralsTest{
    /*
    [ ] 1 → I        [ ] 2 → II       [ ] 3 → III
    [ ] 4 → IV       [ ] 5 → V        [ ] 6 → VI
    [ ] 9 → IX       [ ] 10 → X       [ ] 14 → XIV
    [ ] 40 → XL      [ ] 49 → XLIX    [ ] 50 → L
    [ ] 90 → XC      [ ] 100 → C      [ ] 400 → CD
    [ ] 500 → D      [ ] 900 → CM     [ ] 1000 → M
    [ ] 1994 → MCMXCIV   [ ] 3999 → MMMCMXCIX
    [ ] 0, négatifs, 4000+ → exception
     */


    @Test
    void shouldReturnIForOne(){
    assertThat(RomanNumerals.convert(1)).isEqualTo("I");
    }


    @Test
    void shouldReturnIIForTwo(){
        assertThat(RomanNumerals.convert(2)).isEqualTo("II");
    }

    @Test
    void shouldReturnIVForFour(){
        assertThat(RomanNumerals.convert(4)).isEqualTo("IV");
    }

    @Test
    void shouldReturnVForFive(){
        assertThat(RomanNumerals.convert(5)).isEqualTo("V");
    }

    @Test
    void shouldReturnVIForSix(){
        assertThat(RomanNumerals.convert(6)).isEqualTo("VI");
    }

    @Test
    void shouldReturnVIIForSeven(){
        assertThat(RomanNumerals.convert(7)).isEqualTo("VII");
    }


    @Test
    void shouldReturnIXForNine(){
        assertThat(RomanNumerals.convert(9)).isEqualTo("IX");
    }

    @Test
    void shouldReturnXForTen(){
        assertThat(RomanNumerals.convert(10)).isEqualTo("X");
    }
}

