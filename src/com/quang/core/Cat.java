package com.quang.core;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Gau Gau!!!");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
