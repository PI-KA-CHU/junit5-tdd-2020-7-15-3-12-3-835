package junit5.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_return_1_when_count_off_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("1", result);
    }
}
