package com.quang.core;

public class Memory {
    private int b;
    public static int a;

    private void foo(Object param) { // Line 6
        String str = param.toString(); //// Line 7
        System.out.println(str);
    } // Line 8

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
