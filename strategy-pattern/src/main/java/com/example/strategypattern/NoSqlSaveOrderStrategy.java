package com.example.strategypattern;

public class NoSqlSaveOrderStrategy implements OrderService {

  @Override
  public void saveOrder(String order) {
    System.out.println("order: " + order + " save to noSql");
  }
}
