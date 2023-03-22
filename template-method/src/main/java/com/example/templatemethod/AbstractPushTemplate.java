package com.example.templatemethod;

public abstract class AbstractPushTemplate {

  public void push(int customId, String shopName) {
    System.out.println("prepared push ...");
    execute(customId, shopName);
    System.out.println("finished push ...\n");
  }

  protected abstract void execute(int customId, String shopName);
}
