package com.example.strategypattern;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderServiceExecutor {

  private final OrderService service;

  public void save(String order) {
    this.service.saveOrder(order);
  }
}
