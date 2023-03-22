package com.example.observerpattern;

public interface Subject {

  void registerObserver(Observer observer);

  void notifyAllObservers(String orderNo);
}
