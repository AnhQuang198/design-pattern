package com.quang.dp.facade;

import com.quang.dp.facade.payment.PaymentType;
import com.quang.dp.facade.ship.ShippingType;

public class ZMain {
  public static void main(String[] args) {
    //
    System.out.println("Hello Facade Design Pattern!!");
    System.out.println("Buy product with cash and GHN");
    ShopFacade ic1 = new ShopFacade(ShippingType.GHN, PaymentType.CASH);
    ic1.shippingProcess("Data T-Shirt");
    ic1.paymentProcess();
    System.out.println("Buy product with cash and GHTK");
    ShopFacade ic2 = new ShopFacade(ShippingType.GHTK, PaymentType.CASH);
    ic2.shippingProcess("Data Shore");
    ic2.paymentProcess();
  }
}
