package com.example.observerpattern.lambda;

import com.example.observerpattern.Observer;
import java.util.ArrayList;
import java.util.List;

public interface SubjectLambda {

  List<Observer> list = new ArrayList<>();

  default void registerObserver(Observer observer) {
    list.add(observer);
  }

  default void notifyAllObserver(String orderNo) {
    list.forEach(o -> o.notify(orderNo));
  }
}
