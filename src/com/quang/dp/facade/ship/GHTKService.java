package com.quang.dp.facade.ship;

public class GHTKService implements SendData{
    @Override
    public String sendDataDeliveryUnit(String data) {
        System.out.println("Sending data to GHTK...");
        System.out.println(data + " sent to GHTK!");
        return "200";
    }
}
