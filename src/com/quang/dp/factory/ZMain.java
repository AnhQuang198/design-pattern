package com.quang.dp.factory;

public class ZMain {
  public static void main(String[] args) {
    System.out.println("Hello world!!!");
    Database cntSql = DbFactory.getDatabaseConnection(DatabaseType.MYSQL);
    System.out.println(cntSql.getConnection());
    System.out.println("===========");
    Database cntMongoDb = DbFactory.getDatabaseConnection(DatabaseType.MONGODB);
    System.out.println(cntMongoDb.getConnection());
    System.out.println("===========");

  }
}
