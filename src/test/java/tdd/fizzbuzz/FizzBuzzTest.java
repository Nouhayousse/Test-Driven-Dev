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

}
