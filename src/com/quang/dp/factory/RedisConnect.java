package com.quang.dp.factory;

public class RedisConnect implements Database{
    @Override
    public Connection getConnection() {
        return new Connection("RedisUrl", "redisAdmin", "123456");
    }
}
