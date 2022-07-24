package com.quang.core.collection;

public class ZMain {
  public static void main(String[] args) {
    Student std1 = new Student();
    std1.setName("Quang");
    std1.setAge(24);
    std1.setStatus(true);
    std1.setStudentId(123456);

    Student std2 = new Student();
    std2.setName("Quang");
    std2.setAge(22);
    std2.setStatus(true);
    std2.setStudentId(123123);

    System.out.println(std1.getName().hashCode());
    System.out.println(std2.getName().hashCode());
    System.out.println(std1.getName().equals(std2.getName()));

    System.out.println(std1.getAge().hashCode());
    System.out.println(std2.getAge().hashCode());
    System.out.println("1: " + std1.getAge().equals(std2.getAge()));

    System.out.println(std1.getStudentId() == std2.getStudentId());
    System.out.println(std1.getStudentId() == std2.getStudentId());
  }
}
