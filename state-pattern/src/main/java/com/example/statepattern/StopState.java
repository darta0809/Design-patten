package com.example.statepattern;

public class StopState implements State {

  public void start(Context context) {
    context.setState(new StartState());//注意状态的切换
    System.out.println("start State");
  }

  public void close(Context context) {
  }
}
