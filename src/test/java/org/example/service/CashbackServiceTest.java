package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {
  @Test
  void shouldCalculateWithoutLimit() {
    final var calculator = new Calculator();
    final var amount = 100_00;
    final var expected = 3_00;

    final var actual = calculator.cashback(amount);
    assertEquals(expected, actual);
  }

}