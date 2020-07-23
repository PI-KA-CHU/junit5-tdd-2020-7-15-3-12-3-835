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

    @Test
    void should_return_Fizz_when_count_off_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_count_off_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void should_return_Whizz_when_count_off_given_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 7;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("Whizz", result);
    }

    @Test
    void should_return_FizzBuzz_when_count_off_given_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_21(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 21;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("FizzWhizz", result);
    }

    @Test
    void should_return_BuzzWhizz_when_count_off_given_35(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 35;

        //when
        String result = fizzBuzz.play(inputNumber);

        //then
        Assertions.assertEquals("BuzzWhizz", result);
    }
}
