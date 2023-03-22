package com.example.observerpattern;

import com.example.observerpattern.lambda.SubjectLambda;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverPatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(ObserverPatternApplication.class, args);

    Subject subject = new SubjectImpl();
    subject.registerObserver(new OrderObserver());
    subject.registerObserver(new StockObserver());
    subject.notifyAllObservers("001");

    // lambda
    SubjectLambda lambda = new SubjectLambda() {
    };
    lambda.registerObserver((String orderNo) -> System.out.println(
        "The status of the order: " + orderNo + " is updated to [Paid] by lambda"));
    lambda.registerObserver((String orderNo) -> System.out.println(
        "Order: " + orderNo + " has notified the warehouse to ship! by lambda"));
    lambda.notifyAllObserver("002");
  }

}
