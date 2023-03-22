package com.example.strategypattern.lambda;

import com.example.strategypattern.OrderService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LambdaStrategy implements OrderService {

  NO_SQL_STRATEGY(
      (String order) -> System.out.println("order: " + order + " save to noSql enum strategy")),
  RDBMS_STRATEGY(
      (String order) -> System.out.println("order: " + order + " save to RDBMS enum strategy"));

  private final OrderService orderService;

  @Override
  public void saveOrder(String order) {
    orderService.saveOrder(order);
  }
}
