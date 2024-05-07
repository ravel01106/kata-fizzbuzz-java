package org.fizzbuzz;

public class FizzBuzz {
    public  String convert(int number) {
        String message = "";
        message += isDivisibleByThree(number) ? "Fizz": "";
        message += isDivisibleByFive(number) ? "Buzz": "";
        message = message.isEmpty() ? Integer.toString(number) : message;
        return message;
    }
    private boolean isDivisibleByThree(int number){
        return number % 3 == 0;
    }
    private boolean isDivisibleByFive(int number){
        return number % 5 == 0;
    }
}
