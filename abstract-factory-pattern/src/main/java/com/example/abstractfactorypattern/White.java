package com.example.abstractfactorypattern;

public class White implements Color {

  @Override
  public void fill() {
    System.out.println("fill white color");
  }
}
