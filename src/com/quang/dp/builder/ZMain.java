package com.quang.dp.builder;

public class ZMain {
  public static void main(String[] args) {
    //
    System.out.println("Hello world Builder pattern!!!");
    BankAccount bankAccount = new BankAccount.Builder("Quang", "123456")
            .withEmail("leequang198@gmail.com").build();
    System.out.println(bankAccount.getAccountNumber());
    System.out.println(bankAccount.getAddress());
    System.out.println(bankAccount.getEmail());
    System.out.println(bankAccount.getName());
  }
}
