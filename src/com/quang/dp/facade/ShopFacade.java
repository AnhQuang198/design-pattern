package com.quang.dp.facade;

import com.quang.dp.facade.payment.PaymentService;
import com.quang.dp.facade.payment.PaymentType;
import com.quang.dp.facade.ship.ShippingService;
import com.quang.dp.facade.ship.ShippingType;

import java.util.Objects;

public class ShopFacade {
//    private static ShopFacade instant;
    private ShippingService shippingService;
    private PaymentService paymentService;

    public ShopFacade(ShippingType shippingType, PaymentType paymentType) {
        this.shippingService = new ShippingService(shippingType);
        this.paymentService = new PaymentService(paymentType);
    }

//    public ShopFacade getInstance(ShippingType shippingType, PaymentType paymentType) {
//        if (Objects.isNull(instant)) {
//            instant = new ShopFacade(shippingType, paymentType);
//        }
//        return instant;
//    }

    public String shippingProcess(String data) {
        return shippingService.sendData(data);
    }

    public void paymentProcess() {
        paymentService.sendData();
    }
}
