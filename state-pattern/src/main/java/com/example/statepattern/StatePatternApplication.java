package com.example.statepattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(StatePatternApplication.class, args);

    Context context = new Context();

    // 初始為開始狀態
    context.setState(new StartState());
    // 切換為關閉狀態
    context.close();
    // 切換為開始狀態
    context.start();
  }

}
