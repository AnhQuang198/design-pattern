package com.quang.dp.singleton;

public class ZMain {
  public static void main(String[] args) {
    System.out.println("Lazy init");
    LazyInit lazyInit1 = LazyInit.getInstance();
    LazyInit lazyInit2 = LazyInit.getInstance();

    System.out.println("Lazy init instance 1: " + lazyInit1);
    System.out.println("Lazy init instance 2: " + lazyInit2);
    System.out.println(lazyInit1.equals(lazyInit2));
  }
}
