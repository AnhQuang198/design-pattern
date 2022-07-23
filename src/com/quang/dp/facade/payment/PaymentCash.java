package com.quang.dp.facade.payment;

public class PaymentCash implements PaymentData{
    @Override
    public void sendData() {
        System.out.println("Payment with Cash!!!");
    }
}
