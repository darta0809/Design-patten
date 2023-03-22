package com.example.chainofresponsibilitypattern;

import java.util.function.Consumer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChainOfResponsibilityPatternApplication {

  public static void main(String[] args) {
//    SpringApplication.run(ChainOfResponsibilityPatternApplication.class, args);
    Processor p1 = new ProcessorImpl(null);
    Processor p2 = new OtherProcessorImpl(p1);
    p2.process("something happened");

    Consumer<String> p3 = param -> System.out.println(
        "processor 1 is processing: " + param + " with lambda");
    Consumer<String> p4 = param -> System.out.println(
        "processor 2 is processing: " + param + " with lambda");
    p4.andThen(p3).accept("something happened");

  }

}
