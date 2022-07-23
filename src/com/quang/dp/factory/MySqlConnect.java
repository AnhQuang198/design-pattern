package com.quang.dp.factory;

public class MySqlConnect implements Database{
    @Override
    public Connection getConnection() {
        return new Connection("Mysql", "sqlAdmin", "123456");
    }
}
