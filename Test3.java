package com.example.demo;

interface Interf2 {
    public static void sum(int a, int b) {
     System.out.println(a + b);
    }
   }
   public class Test3 implements Interf2 {
    public static void main(String... args) {
   //  sum(10, 20);            // X
     Test3 t = new Test3();
   //  t.sum(10, 20);          // X
  //   Test3.sum(10, 20);       // X
     Interf2.sum(10, 20);     // ✓
    }
   }