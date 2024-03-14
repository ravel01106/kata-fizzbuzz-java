package org.example;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleCollaboratorTest {


  /*
  @Test
  void sum() {
    CombinationApprovals.verifyAllCombinations(
        this::doSum,
        new Integer[] {-1, 2, 3, 4},
        new Integer[] {-1, 2, 3, 4}
    );
  }
  */


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
  public void devuelveFizzSiEsMultiploDeTres() {
  assertEquals("Fizz", ExampleCollaborator.fizzbuzz(3));
  }
  @Test
  public void devuelveBuzzSiEsMultiploDeCinco() {
    assertEquals("Buzz", ExampleCollaborator.fizzbuzz(5));
  }
  @Test
  public void siNoEsMultiploDeCincoOTresDevolvemosElNumero() {
    assertEquals("1", ExampleCollaborator.fizzbuzz(1));
  }

  @Test
  public void siEsMultiploDeCincoYTresDevolvemosFizzBuzz() {
    assertEquals("FizzBuzz", ExampleCollaborator.fizzbuzz(15));
  }

  @Test
  public void imprimirCienNumerosUtilizandoFizzBuzz() {
    String[] resultado = ExampleCollaborator.contadorUnoAlCien();
    assertEquals(100, resultado.length);
  }
/*
  @Test
  public void devuelveFizzBuzzBuzzSiEsMultiploDeCincoYContieneCincoYTres() {
    assertEquals("FizzBuzzBuzz", ExampleCollaborator.fizzbuzz(35));
  }
  */

  private int doSum(final Integer a, final Integer b) {
    final ExampleCollaborator exampleCollaborator = new ExampleCollaborator();
    return exampleCollaborator.sum(a, b);
  }
}