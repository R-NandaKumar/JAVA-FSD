package com.Multithread;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + ": Count " + i);
        }
    }
}

public class InterFace {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        
        thread1.start();
        thread2.start();
    }
}

