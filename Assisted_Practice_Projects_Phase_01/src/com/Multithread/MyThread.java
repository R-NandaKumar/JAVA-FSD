package com.Multithread;

class MyThreadApp extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThreadApp thread1 = new MyThreadApp();
        MyThreadApp thread2 = new MyThreadApp();
        
        thread1.start();
        thread2.start();
    }
}

