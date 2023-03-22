package com.example.observerpattern;

public class OrderObserver implements Observer {

  @Override
  public void notify(String orderNo) {
    System.out.println("The status of the order: " + orderNo + " is updated to [Paid]");
  }
}
