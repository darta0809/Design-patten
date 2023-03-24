package com.example.statepattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Context {

  private State state;

  public void start() {
    getState().start(this);
  }

  public void close() {
    getState().close(this);
  }

}
