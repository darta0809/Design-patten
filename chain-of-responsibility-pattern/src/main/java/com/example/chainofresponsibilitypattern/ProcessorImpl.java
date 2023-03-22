package com.example.chainofresponsibilitypattern;

public class ProcessorImpl extends AbstractProcessor {

  ProcessorImpl(Processor next) {
    super(next);
  }

  @Override
  public void process(String param) {
    System.out.println("processor 1 is processing: " + param);
    if (getNextProcessor() != null) {
      getNextProcessor().process(param);
    }
  }
}
