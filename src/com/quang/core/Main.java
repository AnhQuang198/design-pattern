package com.quang.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
  int rollno;
  String name;
  static String college = "Bưu Chính Viễn Thông";
  Set<String> s = new HashSet<>();

  static {
    college = "Đại Học Mở Hà Nội";
  }

  static void change() {
    // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
    college = "Đại Học Công Nghệ";
  }

  Main(int r, String n) {
    rollno = r;
    name = n;
  }

  void display() {
    System.out.println(rollno + " - " + name + " - " + college);
  }

  public static void main(String args[]) {

    Main s1 = new Main(111, "Thông");


    Main s2 = new Main(222, "Minh");
    Main s3 = new Main(333, "Anh");

    s1.display();
    s2.display();
    Main.change();
    s3.display();

    Memory mem1 = new Memory(); //new Instance
//    Memory mem2 = new Memory();
    System.out.println("Memory 1 hashcode: " + mem1.hashCode()); //giong nhau
    System.out.println("--------------");
    Memory.a = 5; //set value of static is value of class nen no van giong nhau ve gia tri hashCode
    System.out.println("Memory 2 hashcode: " + mem1.hashCode()); //giong nhau

    System.out.println(mem1.equals(mem1)); //true

    //update value non-static in Memory
    mem1.setB(5);
    System.out.println("Memory 2 hashcode current: " + mem1.hashCode()); //giong nhau
    System.out.println(mem1.equals(mem1));

    Animal cat = new Cat();
    Animal dog = new Dog();
    System.out.println(cat.hashCode());
    System.out.println(dog.hashCode());
    System.out.println("Compare object extend: " + cat.equals(dog));

    List<Integer> nums = new ArrayList<>();
  }
}
