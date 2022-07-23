package com.quang.dp.factory;

public class DbFactory {
    private DbFactory() {}

    public static Database getDatabaseConnection(DatabaseType type) {
        switch (type) {
            case MYSQL:
                return new MySqlConnect();
            case MONGODB:
                return new MongoDbConnect();
            case REDIS:
                return new RedisConnect();
            default:
                throw new IllegalArgumentException("Undefine type: " + type);
        }
    }
}
