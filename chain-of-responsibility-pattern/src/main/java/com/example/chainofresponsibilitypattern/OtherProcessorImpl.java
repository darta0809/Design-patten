package com.example.chainofresponsibilitypattern;

public class OtherProcessorImpl extends AbstractProcessor {

  OtherProcessorImpl(Processor next) {
    super(next);
  }

  @Override
  public void process(String param) {
    System.out.println("processor 2 is processing: " + param);
    if (getNextProcessor() != null) {
      getNextProcessor().process(param);
    }
  }
}
