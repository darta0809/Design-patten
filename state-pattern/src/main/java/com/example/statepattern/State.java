package com.example.statepattern;

public interface State {

  void start(Context context);

  void close(Context context);
}
