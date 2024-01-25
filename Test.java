package com.example.demo;

interface Interf {
    default void m1() {
     System.out.println("Default Method");
    }
   }
   public class Test implements Interf{
    public static void main(String... args) {
     Test t = new Test();
     t.m1();
    }
   }