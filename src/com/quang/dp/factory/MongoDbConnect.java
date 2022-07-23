package com.quang.dp.factory;

public class MongoDbConnect implements Database{
    @Override
    public Connection getConnection() {
        return new Connection("MongoUrl", "mongoAdmin", "123456");
    }
}
