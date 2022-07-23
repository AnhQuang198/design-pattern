package com.quang.dp.facade.ship;

public class GHNService implements SendData{
    @Override
    public String sendDataDeliveryUnit(String data) {
        System.out.println("Sending data to GHN...");
        System.out.println(data + " sent to GHN!");
        return "200";
    }
}
