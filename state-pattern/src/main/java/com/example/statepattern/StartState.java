package com.example.statepattern;

public class StartState implements State {

  public void start(Context context) {
  }

  public void close(Context context) {
    context.setState(new StopState());//注意状态的切换
    System.out.println("close State");
  }
}
