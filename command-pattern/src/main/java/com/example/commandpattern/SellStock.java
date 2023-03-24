package com.example.commandpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SellStock implements Order {

  private final Stock stock;

  @Override
  public void execute() {
    stock.sell();
  }
}
