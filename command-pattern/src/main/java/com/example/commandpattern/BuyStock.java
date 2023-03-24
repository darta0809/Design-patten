package com.example.commandpattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuyStock implements Order {

  private final Stock stock;
  
  @Override
  public void execute() {
    stock.buy();
  }
}
