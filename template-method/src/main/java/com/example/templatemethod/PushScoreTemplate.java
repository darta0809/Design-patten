package com.example.templatemethod;

public class PushScoreTemplate extends AbstractPushTemplate {

  @Override
  protected void execute(int customId, String shopName) {
    System.out.println("Custom: " + customId + ", hello, " + shopName + "given to you 10 scores");
  }
}
