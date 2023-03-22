package com.example.strategypattern;

public class RDBMSSaveOrderStrategy implements OrderService {

  @Override
  public void saveOrder(String order) {
    System.out.println("order: " + order + " save to RDBMS");
  }
}
