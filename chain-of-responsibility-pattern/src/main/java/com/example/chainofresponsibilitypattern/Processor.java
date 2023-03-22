package com.example.chainofresponsibilitypattern;

public interface Processor {

  Processor getNextProcessor();

  void process(String param);
}
