package com.example.observerpattern;

public class StockObserver implements Observer {

  @Override
  public void notify(String orderNo) {
    System.out.println("Order: " + orderNo + " has notified the warehouse to ship!");
  }
}
