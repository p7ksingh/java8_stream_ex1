package com.example.demo;

interface Interf1 {
    default void m1() {
     System.out.println("Default Method");
    }
   }
   public class Test1 implements Interf1{
    public void m1() {
     System.out.println("My own implementation");
    }
    public static void main(String... args) {
     Test1 t = new Test1();
     t.m1();
    }
   }
