package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"1,1","2,2","4,4","7,7"})
    void shouldReturnNumberItselfWhenNotMultiple(int i,String expected){
        // fake it strategy !!
        assertThat(FizzBuzz.convert(i)).isEqualTo(expected);
    }

//    @Test
//    void shouldReturnTwoAsTest(){
//        //This second test will force you to generalize ur code (triangulation)
//        assertThat(FizzBuzz.convert(2)).isEqualTo("2");
//
//    }


    @ParameterizedTest
    @ValueSource(ints = {3,6,9,12})
    void shouldReturnFizzForMultiplesOfThree(int i){
        assertThat(FizzBuzz.convert(i)).isEqualTo("Fizz");
    }


    @ParameterizedTest
    @ValueSource(ints={5,10,20})
    void shouldReturnBuzzForMultiplesOfFive(int i){
        //triangulation de la règle Fizz (6 → “Fizz”)
        assertThat(FizzBuzz.convert(i)).isEqualTo("Buzz");
    }

//    @Test
//    void shouldReturnBuzzForFive(){
//        assertThat(FizzBuzz.convert(5)).isEqualTo("Buzz");
//    }

    @ParameterizedTest
    @ValueSource(ints={15,30,45,60})
    void shouldReturnFizzBuzzForMultiplesOfFifteen(int i){
        assertThat(FizzBuzz.convert(i)).isEqualTo("FizzBuzz");
    }



    @ParameterizedTest
    @ValueSource(ints = {0,-1,-15,-5,-3})
    void shouldRejectNonPositiveNumbers(int i){
        assertThatThrownBy(()->FizzBuzz.convert(i)).isInstanceOf(IllegalArgumentException.class);

    }


    @Test
    void shouldGenerateSequenceUpToFifteen(){
        assertThat(FizzBuzz.sequence(15)).containsExactly("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
    }





}
