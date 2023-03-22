package com.example.strategypattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(StrategyPatternApplication.class, args);

    OrderServiceExecutor noSqlExecutor = new OrderServiceExecutor(new NoSqlSaveOrderStrategy());
    noSqlExecutor.save("001");
    OrderServiceExecutor rdbmsExecutor = new OrderServiceExecutor(new RDBMSSaveOrderStrategy());
    rdbmsExecutor.save("002");

    // functional implementation Strategy pattern
    noSqlExecutor = new OrderServiceExecutor(
        (String order) -> System.out.println("order: " + order + " save to noSql lambda"));
    noSqlExecutor.save("003");
    rdbmsExecutor = new OrderServiceExecutor(
        (String order) -> System.out.println("order: " + order + " save to RDBMS lambda"));
    rdbmsExecutor.save("004");

    // lambda implementation with enum Strategy pattern
    noSqlExecutor = new OrderServiceExecutor(LambdaStrategy.NO_SQL_STRATEGY);
    noSqlExecutor.save("005");
    rdbmsExecutor = new OrderServiceExecutor(LambdaStrategy.RDBMS_STRATEGY);
    rdbmsExecutor.save("006");
  }
}
