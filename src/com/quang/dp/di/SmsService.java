package com.quang.dp.di;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS sent with message: " + msg);
    }
}
