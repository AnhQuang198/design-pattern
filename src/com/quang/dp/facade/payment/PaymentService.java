package com.quang.dp.facade.payment;

public class PaymentService {
    private final PaymentData paymentData;

    public PaymentService(PaymentType type) {
        switch (type) {
            case CASH:
                paymentData = new PaymentCash();
                break;
            case PAYPAL:
                paymentData = new PaymentPaypal();
                break;
            default:
                throw new IllegalArgumentException(type + " is undefine!!!");
        }
    }

    public void sendData() {
        paymentData.sendData();
    }
}
