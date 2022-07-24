package com.quang.core.collection;

import java.util.HashSet;
import java.util.Set;

public class SetMain {
  public static void main(String[] args) {
      Set<String> data = new HashSet<>();
      data.add("Hello");
      data.add("Quang");
      data.add("DZ");

      for (String s : data) {
        System.out.println(s.hashCode());
      }
  }
}
