package com.example.demo;

interface Left {
    default void m1() {
     System.out.println("Left.m1()");
    }
   }
   interface Right {
    default void m1() {
     System.out.println("Right.m1()");
    }
   }
   public class Test2 implements Left, Right {
    public void m1() {
     System.out.println("Test.m1()");
     Left.super.m1();
     Right.super.m1();
    }
    public static void main(String... args) {
     Test2 t = new Test2();
     t.m1();
    }
   }
