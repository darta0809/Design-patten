package com.example.chainofresponsibilitypattern;

public abstract class AbstractProcessor implements Processor {

  private final Processor processor;

  AbstractProcessor(Processor processor) {
    this.processor = processor;
  }

  @Override
  public Processor getNextProcessor() {
    return processor;
  }
}
