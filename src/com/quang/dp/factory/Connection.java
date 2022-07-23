package com.quang.dp.factory;

import java.util.Objects;

public class Connection {
//    private static Connection instance;

    public Connection(String url, String username, String password) {
        System.out.println("Database url: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

//    public static Connection getInstance(String url, String username, String password) {
//        if (Objects.isNull(instance)) {
//            instance = new Connection(url, username, password);
//        }
//        return instance;
//    }

}
