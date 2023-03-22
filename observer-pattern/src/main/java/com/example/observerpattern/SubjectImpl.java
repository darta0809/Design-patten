package com.example.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

  private final List<Observer> list = new ArrayList<>();

  @Override
  public void registerObserver(Observer observer) {
    list.add(observer);
  }

  @Override
  public void notifyAllObservers(String orderNo) {
    list.forEach(o -> o.notify(orderNo));
  }
}
