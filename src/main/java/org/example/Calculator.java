package org.example;

public class Calculator {
  public int cashback(int amount) {
    final var cashback = amount * 3 / 100;
    if (cashback > 3_000) {
      return 3_000;
    }

    return cashback;
  }
}
