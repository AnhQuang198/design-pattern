package com.quang.dp.builder;

public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private String address;

    public BankAccount(String name, String accountNumber, String email, String address) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder {
        private String name;
        private String accountNumber;
        private String email;
        private String address;

        public Builder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this.name, this.accountNumber, this.email, this.address);
        }
    }
}
