package com.example.templatemethod;

public class PushCouponTemplate extends AbstractPushTemplate {

  @Override
  protected void execute(int customId, String shopName) {
    System.out.println("Member: " + customId + ", hello, " + shopName + "given to you coupon");
  }
}
