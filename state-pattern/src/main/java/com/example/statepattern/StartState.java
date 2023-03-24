package com.example.statepattern;

public class StartState implements State {

  @Override
  public void start(Context context) {
  }

  @Override
  public void close(Context context) {
    context.setState(new StopState());//注意状态的切换
    System.out.println("close State");
  }
}
