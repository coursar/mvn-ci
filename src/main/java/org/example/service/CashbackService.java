package org.example.service;

public class CashbackService {
  public int calculate(int amount) {
    final var limit = 3_000_00;
    final var percent = 3;
    final var cashback = amount * percent / 100;
    if (cashback > limit) {
      return limit;
    }
    return cashback;
  }
}
