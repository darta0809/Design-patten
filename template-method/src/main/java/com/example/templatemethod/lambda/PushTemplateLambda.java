package com.example.templatemethod.lambda;

import java.util.function.Consumer;

public class PushTemplateLambda {

  public void push(int customId, String shopName, Consumer<Object[]> execute) {
    System.out.println("prepared push ...");
    Object[] params = new Object[]{customId, shopName};
    execute.accept(params);
    System.out.println("finished push ...\n");
  }
}
