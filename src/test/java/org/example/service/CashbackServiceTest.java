package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackServiceTest {
  @Test
  void shouldCalculateWithoutLimit() {
    final var service = new CashbackService();
    final var amount = 100_00;
    final var expected = 3_00;

    final var actual = service.calculate(amount);
    assertEquals(expected, actual);
  }

}