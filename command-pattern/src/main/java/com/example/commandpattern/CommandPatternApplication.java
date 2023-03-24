package com.example.commandpattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandPatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(CommandPatternApplication.class, args);

    Stock stock = new Stock();

    BuyStock buyStock = new BuyStock(stock);
    SellStock sellStock = new SellStock(stock);

    Broker broker = new Broker();
    broker.takeOrder(buyStock);
    broker.takeOrder(sellStock);

    broker.placeOrders();
  }

}
