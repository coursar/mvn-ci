package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
  @Test
  void shouldCalculateWithoutLimit() {
    final var calculator = new Calculator();
    final var amount = 100;
    final var expected = 3;

    final var actual = calculator.cashback(amount);
    assertEquals(expected, actual);
  }

}