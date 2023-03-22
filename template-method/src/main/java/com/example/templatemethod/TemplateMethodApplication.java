package com.example.templatemethod;

import com.example.templatemethod.lambda.PushTemplateLambda;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TemplateMethodApplication {

  public static void main(String[] args) {
//    SpringApplication.run(TemplateMethodApplication.class, args);

    AbstractPushTemplate coupon = new PushCouponTemplate();
    coupon.push(1, "Car store");
    AbstractPushTemplate score = new PushScoreTemplate();
    score.push(1, "Fishing store");

    // lambda
    new PushTemplateLambda().push(1, "Car store", (Object[] obj) -> System.out.println(
        "Member: " + obj[0] + ", hello, " + obj[1] + "given to you coupon with lambda"));

    new PushTemplateLambda().push(1, "Fishing store", (Object[] obj) -> System.out.println(
        "Member: " + obj[0] + ", hello, " + obj[1] + "given to you 10 scores with lambda"));
  }

}
