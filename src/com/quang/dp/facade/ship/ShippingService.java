package com.quang.dp.facade.ship;

public class ShippingService {
    private final SendData sendData;

    public ShippingService(ShippingType type) {
        switch (type) {
            case GHN:
                sendData = new GHNService();
                break;
            case GHTK:
                sendData = new GHTKService();
                break;
            default:
                throw new IllegalArgumentException(type + " is undefine!");
        }
    }

    public String sendData(String data) {
        return sendData.sendDataDeliveryUnit(data);
    }
}
