package org.example;

public final class ExampleCollaborator {
  public static String fizzbuzz(int i) {
    if ( i % 3 == 0 && i % 5 == 0 ) {
      return "FizzBuzz";

    } else if ( i % 3 == 0 ) {
      return "Fizz";

    } else if ( i % 5 == 0 ) {
      return "Buzz";

    }
    return Integer.toString(i);
  }

  public static String[] contadorUnoAlCien() {
    String[] listadaFizzBuzz = new String[100];
    String word = "";

    for (int i = 0; i < 100; i++) {
      word = fizzbuzz(i+1);
      System.out.println(word);
      listadaFizzBuzz[i] = word;
    }

    return listadaFizzBuzz;
  }

  public int sum(int a, int b) {
    return a + b;
  }
}
