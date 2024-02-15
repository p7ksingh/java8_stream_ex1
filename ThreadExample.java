package com.example.demo;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}
public class ThreadExample {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start(); // Start the thread
        MyRunnable r = new MyRunnable();
        r.run();
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}