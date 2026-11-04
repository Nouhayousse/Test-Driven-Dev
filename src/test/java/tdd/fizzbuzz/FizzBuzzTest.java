package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void shouldReturnOneAsTest(){
        // fake it strategy !!
        assertThat(FizzBuzz.convert(1)).isEqualTo("1");
    }

    @Test
    void shouldReturnTwoAsTest(){
        //This second test will force you to generalize ur code (triangulation)
        assertThat(FizzBuzz.convert(2)).isEqualTo("2");

    }


    @Test
    void shouldReturnFizzForThree(){
        assertThat(FizzBuzz.convert(3)).isEqualTo("Fizz");
    }


    @Test
    void shouldReturnFizzForSix(){
        //triangulation de la règle Fizz (6 → “Fizz”)
        assertThat(FizzBuzz.convert(6)).isEqualTo("Fizz");
    }

    @Test
    void shouldReturnBuzzForFive(){
        assertThat(FizzBuzz.convert(5)).isEqualTo("Buzz");
    }

    @Test
    void shouldReturnFizzBuzzForFifteen(){
        assertThat(FizzBuzz.convert(15)).isEqualTo("FizzBuzz");
    }



    @Test
    void shouldRejectZero(){
        assertThatThrownBy(()->FizzBuzz.convert(0)).isInstanceOf(IllegalArgumentException.class);

    }


    @Test
    void shouldGenerateSequenceUpToFifteen(){
        assertThat(FizzBuzz.sequence(15)).containsExactly("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
    }



}
