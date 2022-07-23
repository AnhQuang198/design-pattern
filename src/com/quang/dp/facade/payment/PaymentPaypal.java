package com.quang.dp.facade.payment;

public class PaymentPaypal implements PaymentData{
    @Override
    public void sendData() {
        System.out.println("Payment with Paypal!!!");
    }
}
