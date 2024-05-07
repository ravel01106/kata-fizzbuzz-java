package org.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzShould {
    /**
     * ----- STAGE 1 -----
     * -> fizzbuzz(3) = Fizz
     * -> fizzbuzz(5) = Buzz
     * -> fizzbuzz(2) = 2
     * -> fizzbuzz(15) = FizzBuzz
     * ---------------------------------------------------
     * ----- STAGE 2 -----
     * -> fizzbuzz(3) = FizzFizz
     * -> fizzbuzz(5) = BuzzBuzz
     * -> fizzbuzz(2) = 2
     * -> fizzbuzz(15) = FizzBuzzBuzz
     * -> fizbuzz(35) = FizzBuzzBuzz
     * -> fizzbuzz(53) = FizzBuzz
     * ---------------------------------------------------
     */

    @Test
    public void return_fizz_if_multiples_three() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Fizz", fizzbuzz.convert(3));
    }
    @Test
    public void return_buzz__if_multiples_five() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("Buzz", fizzbuzz.convert(5));
    }
    @Test
    public void return_number_if_not_multiple_three_or_five() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.convert(1));
    }

    @Test
    public void return_fizzbuzz_if_multiple_three_and_five() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzbuzz.convert(15));
    }

}