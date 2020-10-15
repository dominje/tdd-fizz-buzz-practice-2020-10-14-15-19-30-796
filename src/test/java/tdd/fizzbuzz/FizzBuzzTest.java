package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_Fizz_when_multiple_of_three_given_order_number_is_three() {
        // given
        int inputNumber = 3;

        // when
        String actual = fizzBuzz.countOff(inputNumber);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_Buzz_when_multiple_of_five_fiven_order_number_is_five() {
        // given
        int inputNumber = 5;

        // when
        String actual = fizzBuzz.countOff(inputNumber);

        // then
        assertEquals("Buzz", actual);

    }

    @Test
    void should_return_Whizz_when_multiple_of_seven_fiven_order_number_is_seven() {
        // given
        int inputNumber = 7;

        // when
        String actual = fizzBuzz.countOff(inputNumber);

        // then
        assertEquals("Whizz", actual);
    }

    @Test
    void should_return_FizzBuzz_when_multiple_of_three_and_five_order_number_is_15() {
        // given
        int inputNumber = 15;

        // when
        String actual = fizzBuzz.countOff(inputNumber);

        // then
        assertEquals("FizzBuzz", actual);
    }

    @Test
    void should_return_FizzWhizz_when_multiple_of_three_and_seven_order_number_is_21() {
        // given
        int inputNumber = 21;

        // when
        String actual = fizzBuzz.countOff(inputNumber);

        // then
        assertEquals("FizzWhizz", actual);
    }
}
